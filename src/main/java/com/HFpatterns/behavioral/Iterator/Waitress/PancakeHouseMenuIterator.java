import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
