public class HomeTheatreFacade {
    DvdPlayer dvd;
    TheatreLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheatreFacade(DvdPlayer dvd, TheatreLights lights, Screen screen, PopcornPopper popper) {
        this.dvd = dvd;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theatre down...");
        popper.off();
        lights.on();
        screen.up();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
