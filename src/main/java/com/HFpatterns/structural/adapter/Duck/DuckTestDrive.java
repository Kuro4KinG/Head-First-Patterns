public class DuckTestDrive {
    public static void main(String[] args) {
        SimpleDuck duck = new SimpleDuck();

        WildTurkey turkey = new WildTurkey();
        DuckInterface turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(DuckInterface duck) {
        duck.quack();
        duck.fly();
    }
}
