package Examples.MobilePhoneApp;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<User> contacts;
    private String myNumbers;

    public MobilePhone(String myNumbers) {
        this.myNumbers = myNumbers;
        this.contacts = new ArrayList<User>();
    }

    public boolean addNewUser(User newUser){

        if(userSearch(newUser.getName())>=0 ){
            System.out.println(newUser.getName()+" this user is already in your contacts.");
            return false;
        }

        this.contacts.add(newUser);
        return true;
    }
    public int userSearch(User searchForUser){
        return this.contacts.indexOf(searchForUser);
    }
    public int userSearch(String searchByUserName){
        for(int i = 0; i<this.contacts.size(); i++){
            User currentUser=this.contacts.get(i);
            if(currentUser.getName().equals(searchByUserName))
                return i;

        }return -1;
    }

    public User userQuery(String isim) {
        int position= userSearch(isim);
        if(position>=0){
            return contacts.get(position);
        }return null;
    }

    public boolean removeUser(User user){
       int position= userSearch(user);
       if(position<0){
           System.out.println("User deleted.");
           return false;
       }
       this.contacts.remove(user);
       return true;

    }

    public boolean updateUser(User oldUser, User newUser){
        int bulunanPosition= userSearch(oldUser);
        if (bulunanPosition<0){
            System.out.println("This user is not in your contacts.");
            return false;
        }
        this.contacts.set(bulunanPosition, newUser);
        System.out.println(oldUser.getName()+" with "+newUser.getName()+" changed.");
        return true;
    }

    public void allUser(){
        System.out.println("\n********** CONTACTS **********");
        if(contacts.size()==0){
            System.out.println("---\nUser has not been saved yet!\n---");
            return;
        }
        for(int i = 0; i<this.contacts.size(); i++){
            System.out.println((i+1)+" - "+ contacts.get(i).getName()+" -> "+ contacts.get(i).getMobileNumber());
        }
    }

}
