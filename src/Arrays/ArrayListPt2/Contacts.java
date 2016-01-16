package Arrays.ArrayListPt2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Raffi on 1/8/2016.
 */
public class Contacts {

    private String name, phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Calls the constructor to create a new contact record and returns it
    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<String> contacts = new ArrayList<>();

    public void printContactList() {
        System.out.println("You have " + contacts.size() + " contacts in your list.");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    public void addNewContact(String fullContact) {
        contacts.add(fullContact);
    }

    public void updateContact(int position, String fullInfo) {
        contacts.set(position, fullInfo);
        System.out.println("Contact " + position + " has been updated.");
    }

    public void removeContact(int position) {
        contacts.remove(position);
        System.out.println("Contact " + position + " has been removed.");
    }

    public int searchContact(String name) {
        return contacts.indexOf(name);
    }

    public boolean onFile(String name) {
        int position = searchContact(name);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
