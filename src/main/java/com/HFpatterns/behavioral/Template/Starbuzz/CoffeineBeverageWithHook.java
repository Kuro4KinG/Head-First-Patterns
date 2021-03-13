public abstract class CoffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        if (customerWantsCondiments()) {
            addCondiments();

        }
        pourInCup();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
