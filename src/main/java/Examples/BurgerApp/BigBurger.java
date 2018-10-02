package Examples.BurgerApp;

public class BigBurger extends Hamburger {
    public BigBurger() {
        super("Big Burger", "White Bread", "Red Meat", 14.90);
        super.addProduct1("Fries", 2.5);
        super.addProduct2("Cola", 3.5);
    }

    @Override
    public void addProduct1(String name, double total) {
        System.out.println(("\nCannot add additional products.\n").toUpperCase());
    }

    @Override
    public void addProduct2(String name, double total) {
        System.out.println(("\nCannot add additional products.\n").toUpperCase());
    }

    @Override
    public void addProduct3(String name, double total) {
        System.out.println(("\nCannot add additional products.\n").toUpperCase());
    }

    @Override
    public void addProduct4(String name, double total) {
        System.out.println(("\nCannot add additional products.\n").toUpperCase());
    }
}
