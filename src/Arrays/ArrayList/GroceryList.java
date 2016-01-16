package Arrays.ArrayList;

import java.util.ArrayList;

/**
 * Created by Raffi on 1/2/2016.
 */
public class GroceryList {

    //Array list named groceryList.
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {

        groceryList.add(item.toLowerCase());
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
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
        System.out.println("Item removed.");


    }

    private int findItem(String searchItem) {

       /* //.contains goes through the array list and sees if there is a match of the item
        boolean exists = groceryList.contains(searchItem);

        if(exists) {*/

        return groceryList.indexOf(searchItem);
          /*
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
