public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
