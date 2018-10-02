package Examples.CepTelefonuUygulamasi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static MobilePhone mobilePhone =new MobilePhone("0250 250 25 20");
    public static void main(String[] args) {
       // Kisi.create("Göksu","555");//Kisi k=new Kisi("Göksu","555");

        telephoneStart();
        menuShow();
        boolean exit=false;
        while(!exit){
            System.out.println("Select: (Press 6 to see the menu):");
            int choice=scanner.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Exiting...");
                    exit=true;
                    break;

                case 1:
                    mobilePhone.allUser();
                    break;

                case 2:
                    newUserAddMethod();
                    break;

                case 3:
                    userQueryMethod();
                    break;

                case 4:
                    userDeleteMethod();
                    break;

                case 5:
                    userUpdateMethod();
                    break;

                case 6:
                    menuShow();
                    break;

                    default:
                        System.out.println("Please do choose again. (1-6)");
            }
        }
    }

    private static void userUpdateMethod() {
        System.out.println("Enter the name of the user to update: ");
        String name=scanner.next();
        User basedUser= mobilePhone.userQuery(name);
        if (basedUser == null){
            System.out.println("User not found\n");
            return;
        }
        System.out.println("New name: ");
        String newName=scanner.next();
        System.out.println("New phone number: ");
        String newMobileNumber=scanner.next();
        mobilePhone.updateUser(basedUser,User.create(newName,newMobileNumber));

    }

    private static void userDeleteMethod() {
        System.out.println("Enter the name of the user to delete: ");
        String name=scanner.next();
        User basedUser= mobilePhone.userQuery(name);
        if(mobilePhone.removeUser(basedUser))
            System.out.println("Deleted user.");

    }

    private static void userQueryMethod() {
        System.out.println("Enter the contact name to search: ");
        String name=scanner.next();
        User basedUser= mobilePhone.userQuery(name);
        if(basedUser==null){
            System.out.println(name+" user not found");
            return;
        }
        System.out.println("Based User : "+basedUser.getName()+" -> "+basedUser.getMobileNumber());
    }

    private static void newUserAddMethod() {
        System.out.println("Name of new user: ");
        String name=scanner.next();
        System.out.println("Phone number of new user: ");
        String number=scanner.next();
        mobilePhone.addNewUser(User.create(name,number));

    }

    private static void menuShow() {
        System.out.println("**********MENU**********");
        System.out.println("0 -- Exit\n" +
                "1 -- Contacts\n" +
                "2 -- New User Add\n" +
                "3 -- User Search\n" +
                "4 -- User Delete\n" +
                "5 -- User Update\n" +
                "6 -- Show Menu\n");
    }

    private static void telephoneStart() {
        System.out.println("Starting the Phone...");
    }

}
