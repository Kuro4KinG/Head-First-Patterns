public class Waitress2 {
    MenuComponent allMenus;

    public Waitress2(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
