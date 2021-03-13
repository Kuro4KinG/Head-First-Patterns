public class HomeTheatreTestDrive {
    public static void main(String[] args) {


        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(new DvdPlayer(), new TheatreLights(), new Screen(), new PopcornPopper());
        homeTheatre.watchMovie("Inception");
        homeTheatre.endMovie();
    }
}
