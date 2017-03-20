package Section04.ArrayLists.Section01.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Raffi
 */
public class ArrayListMain {

    /*Array list elements include:
    * .add: adds the item that was passed into the method into the Array list.
    * .get: returns the values of items stored in the Array list.
    * .set: modifies a certain position in the array list with a new value.
    * .size: returns the size of the array list.
    * .remove: removes the item specified by a certain value.
    * .indexOf: returns a number of the position in the array list where searchItem is.*/

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = true;
        int choice = 0;

        printInstructions();
        while (quit) {

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = false;
                    break;

            }

        }
    }


    public static void printInstructions() {

        // \t means to add a tab in the beginning of the string
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To process the list.");
        System.out.println("\t 7 - To quit the application.");

    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemNum = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNum, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem.toLowerCase())) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not found on file.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        //copies all contents of the array list to this newArray
        newArray.addAll(groceryList.getGroceryList());
        //another way to copy all contents of the array list to this nextArray
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        //storing the array list contents into an array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}







