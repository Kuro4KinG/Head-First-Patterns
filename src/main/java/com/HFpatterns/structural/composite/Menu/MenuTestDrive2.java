public class MenuTestDrive2 {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu2("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu2("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu2("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu2("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu2("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem2("Pasta", "Spaghetti with sauce", true, 3.89));


        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem2("Apple pie", "Apple pie with a flakey crust", true, 1.59));

        Waitress2 waitress2 = new Waitress2(allMenus);
        waitress2.printMenu();
    }
}
