package Examples.BurgerApp;

public class HealthyBurger extends Hamburger{

    private String additionalHealthyProductName1;
    private  double additionalHealthyProductTotal1;

    private String additionalHealthyProductName2;
    private  double additionalHealthyProductTotal2;

     public HealthyBurger(String meatPreference, double total) {
        super("Health Burger","Light Bread", meatPreference, total);
    }

    public void addHealthyProduct1(String name, double total){
         this.additionalHealthyProductName1 =name;
         this.additionalHealthyProductTotal1 =total;
    }

    public void addHealthyProduct2(String name, double total){
        this.additionalHealthyProductName2 =name;
        this.additionalHealthyProductTotal2 =total;
    }

    @Override
    public double hamburgerDetails() {
        double totalCharge=super.hamburgerDetails();
        if(this.additionalHealthyProductName1 !=null){
            totalCharge+= additionalHealthyProductTotal1;
            System.out.println("Additional Healthy Product Name: "+this.additionalHealthyProductName1 +" Charge: "+this.additionalHealthyProductTotal1);
        }if(this.additionalHealthyProductName2 !=null){
            totalCharge+= additionalHealthyProductTotal2;
            System.out.println("Additional Healthy Product Name: "+this.additionalHealthyProductName2 +" Charge: "+this.additionalHealthyProductTotal2);
        }
        return totalCharge;
    }
}
