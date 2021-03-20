import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Sequence sequence;
    Track track;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        System.out.println("Starting the sequencer");
        sequencer.start();
        setBpm(90);
    }

    @Override
    public void off() {
        setBpm(0);
        sequencer.stop();
    }

    @Override
    public void setBpm(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        int i = beatObservers.indexOf(o);
        if (i >= 0) {
            beatObservers.remove(i);
        }
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        int i = bpmObservers.indexOf(o);
        if (i >= 0) {
            bpmObservers.remove(i);
        }
    }

    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBpm(getBPM());
        }
    }

    public void notifyBeatObservers() {
        for (int i = 0; i < beatObservers.size(); i++) {
            BeatObserver beatObserver = (BeatObserver) beatObservers.get(i);
            beatObserver.updateBeat();
        }
    }

    public void notifyBPMObservers() {
        for (int i = 0; i < beatObservers.size(); i++) {
            BPMObserver bpmObserver = (BPMObserver) bpmObservers.get(i);
            bpmObserver.updateBPM();
        }
    }

    void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];

            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));

            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
