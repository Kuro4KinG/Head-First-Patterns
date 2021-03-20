import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
//    Menu pancakeHouseMenu;
//    Menu dinerMenu;
//    Menu cafeMenu;
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
//        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//        System.out.println("MENU\n----\nBREAKFAST");
//        printMenu(pancakeIterator);
//        System.out.println("\nLUNCH");
//        printMenu(dinerIterator);
//        System.out.println("\nDINNER");
//        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
