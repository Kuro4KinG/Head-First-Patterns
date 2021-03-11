public class BoilerRunner {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getChocolateBoiler();
        chocolateBoiler.fill();
        System.out.println();
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getChocolateBoiler();
        chocolateBoiler1.fill();
        chocolateBoiler.boil();
        chocolateBoiler.boil();
        chocolateBoiler1.drain();

    }
}
