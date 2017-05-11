package Section07.Interfaces.Section02.InterfacesPt2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Raffi
 */
public class InterfacePt2Main {

    public static void main(String[] args) {

        Player raffi = new Player("Raffi", 10, 15);
        System.out.println(raffi.toString());
        saveObject(raffi);

        raffi.setHitPoints(8);
        System.out.println(raffi);
        raffi.setWeapon("Ice");
        saveObject(raffi);
        //loadObject(raffi);
        System.out.println(raffi);

        Monster dragon = new Monster("Dragon", 20, 40);
        System.out.println(dragon.toString());
        saveObject(dragon);
    }

    /*Using the Saveable interface, we can use any method that is under a class that implements it. */
    public static void saveObject(Saveable objectToSave) {
        /*objectToSave.write().size() goes through each object in the write() method in the Player class
        * and returns the size of it. (4)*/
        for (int i = 0; i < objectToSave.write().size(); i++) {
            /*objectToSave.get(i) prints the name of the object.*/
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "0. Quit.\n" +
                "1. Enter a string.");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
