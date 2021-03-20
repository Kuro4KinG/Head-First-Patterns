import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends MenuComponent implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancake ",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
        //return new PancakeHouseMenuIterator(menuItems);
    }

    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("   -- " + getDescription());
    }
}
