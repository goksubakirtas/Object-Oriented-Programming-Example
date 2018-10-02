package Examples.BurgerApp;

public class Hamburger {
    private String name;
    private String breadPreference;
    private String meatPreference;
    private double total;

    private String additionalProductName1;
    private double additionalProductTotal1;

    private String additionalProductName2;
    private double additionalProductTotal2;

    private String additionalProductName3;
    private double additionalProductTotal3;

    private String additionalProductName4;
    private double additionalProductTotal4;

    public void addProduct1(String name, double total){
        this.additionalProductName1 =name;
        this.additionalProductTotal1 =total;
    }

    public void addProduct2(String name, double total){
        this.additionalProductName2 =name;
        this.additionalProductTotal2 =total;
    }

    public void addProduct3(String name, double total){
        this.additionalProductName3 =name;
        this.additionalProductTotal3 =total;
    }

    public void addProduct4(String name, double total){
        this.additionalProductName4 =name;
        this.additionalProductTotal4 =total;
    }

    public Hamburger(String name, String breadPreference, String meatPreference, double total) {
        this.name = name;
        this.breadPreference = breadPreference;
        this.meatPreference = meatPreference;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadPreference() {
        return breadPreference;
    }

    public void setBreadPreference(String breadPreference) {
        this.breadPreference = breadPreference;
    }

    public String getMeatPreference() {
        return meatPreference;
    }

    public void setMeatPreference(String meatPreference) {
        this.meatPreference = meatPreference;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double hamburgerDetails(){
        double totalCharge=this.total;
        System.out.println("\nHamburger name: "+this.name +"\nBread Preference: "+this.breadPreference +"\nMeat Preference: "+this.breadPreference +"\nTotal: "+this.total);
        if(this.additionalProductName1 != null) {
            totalCharge += this.additionalProductTotal1;
            System.out.println("Additional Product: "+this.additionalProductName1 + " Charge: "+this.additionalProductTotal1);
        }if(this.additionalProductName2 != null) {
            totalCharge += this.additionalProductTotal2;
            System.out.println("Additional Product: "+this.additionalProductName2 + " Charge: "+this.additionalProductTotal2);
        }if(this.additionalProductName3 != null) {
            totalCharge += this.additionalProductTotal3;
            System.out.println("Additional Product: "+this.additionalProductName3 + " Charge: "+this.additionalProductTotal3);
        }if(this.additionalProductName4 != null) {
            totalCharge += this.additionalProductTotal4;
            System.out.println("Additional Product: "+this.additionalProductName4 + " Charge: "+this.additionalProductTotal4);
        }
        return totalCharge;
    }
}
