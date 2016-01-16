package Arrays.ArrayListPt2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Raffi on 1/8/2016.
 */
public class MobilePhone {

    private String myNumber;



    /*The creation of the array list myContacts can be thought of as array list version of composition.*/
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>(); //Initializing the array list in the constructor.
    }


    public boolean addNewContact(Contacts contact) {
        /*If the findContact method returns a number greater than zero, it means that
        * that contact is already in the array list and prints a message stating so
        * and returns false.*/
        if (findContact(contact.getName()) >= 0) {
            System.out.println(contact.getName() + " is already in your contact list.");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        /*Creates a foundPosition object which is equal to the int the findContact method returns
        * when it is passed with the oldContact. It then checks if it was not found. If it is found,
        * it places the newContact value in the oldContact's position in the myContacts array list.*/
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());

        return true;
    }

    public boolean removeContact(Contacts contact) {
        /*Creates a foundPosition object which is equal to the int the findContact method returns
        * when it is passed with the contact. It then checks if it was not found. If it is found,
        * it removes it based on its position in the array list, prints it was deleted,
        * and returns true.*/
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contacts contact) {
       /*Returns the integer showing the element position in the array list for that particular contact object
       the number that will be returned will be 0 or greater if it exists and return a number less than 0
       if it doesn't exist.*/
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        /*Loops through all the elements in the array list to see if the name that has been passed
        has a match.*/
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i; //gets contact position in array list when contact is on file
            }
        }

        return -1;
    }

    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                                this.myContacts.get(i).getName() + " -> " +
                                this.myContacts.get(i).getPhoneNumber());
        }
    }
}
