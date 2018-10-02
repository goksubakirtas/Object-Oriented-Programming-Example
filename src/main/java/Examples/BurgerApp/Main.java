package Examples.BurgerApp;

public class Main {
    public static void main(String[  ] args) {
        Hamburger hamburger=new Hamburger("Simple Hamburger","White Bread","Red Meat",7.90);
        hamburger.addProduct1("Fries",3.30);
        hamburger.addProduct2("Cola",3.50);
        hamburger.addProduct3("Sauce",1.20);
        hamburger.addProduct4("Onion",0.20);
        //double toplamUcret=hamburger.hamburgerBilgileri();
        System.out.println("\nTotal:  "+hamburger.hamburgerDetails());

        HealthyBurger healthyBurger =new HealthyBurger("White Meat",4.90);
        healthyBurger.addProduct1("Patates Kızartması",3.30);
        healthyBurger.addProduct2("Cola",3.50);
        healthyBurger.addProduct3("Sauce",1.20);
        healthyBurger.addProduct4("Onion",0.20);
        healthyBurger.addHealthyProduct1("Tuna Fish ",1.50);
        healthyBurger.addHealthyProduct1("Tomato",2.20);
        System.out.println("\nTotal:  "+ healthyBurger.hamburgerDetails());

        BigBurger bigBurger =new BigBurger();
        bigBurger.addProduct1("Fries",3.5);
        System.out.println("\nTotal: "+ bigBurger.hamburgerDetails());

    }
}
