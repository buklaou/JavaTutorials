package Arrays.ArrayList;

import java.util.ArrayList;

/**
 * Created by Raffi on 1/2/2016.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {

        //.add adds the item that was passed into the method into the Array list
        groceryList.add(item);
    }

    public void printGroceryList() {

        //.size returns the amount of items stored in the Array list
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1 ) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
                if(position >= 0 ) {
                    modifyGroceryItem(position, newItem);
                }
    }

    private void modifyGroceryItem(int position, String newItem) {

        //.set modifies a certain position in the array list with a new string
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0 ) {
            removeGroceryItem(position);
        }

    }

    private void removeGroceryItem(int position) {

      //String theItem = groceryList.get(position);
        groceryList.remove(position);


    }

    private int findItem(String searchItem) {

       /* //.contains goes through the array list and sees if there is a match of the item
        boolean exists = groceryList.contains(searchItem);

        if(exists) {*/

        return groceryList.indexOf(searchItem);
          /*  //.indexOf returns a number of the position in the array list where searchItem is
            int position = groceryList.indexOf(searchItem);

            return groceryList.get(position);
        }

        return null;*/
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }

}
