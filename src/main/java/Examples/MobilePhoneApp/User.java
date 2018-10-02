package Examples.CepTelefonuUygulamasi;

public class User {
    private String name;
    private String mobileNumber;

    public User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public static User create(String name, String mobileNumber){
        return new User(name, mobileNumber);
    }




}
