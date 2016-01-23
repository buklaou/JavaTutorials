package Section06.LinkedLists.Section01.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Raffi on 1/17/2016.
 */
public class LinkedMain {
    public static void main(String[] args) {

        //Linked List to store names of cities to visit in Europe
        /*List<String> placesToVisit = new LinkedList<>();
        * The above line is a better way to make use of Java's built in interfaces and is
        * a better way of coding and creating Lists. First you create it using List and specify
        * the list you are using on the right side (such as LinkedList, ArrayList, Vector)*/
        LinkedList<String> placesToVisit = new LinkedList<>();
        /*placesToVisit.add("Barcelona");
        placesToVisit.add("Ibiza");
        placesToVisit.add("Paris");
        placesToVisit.add("London");
        placesToVisit.add("Bruges");
        placesToVisit.add("Prague");
        placesToVisit.add("Berlin");
        placesToVisit.add("Venice");
        placesToVisit.add("Rome");
        placesToVisit.add("Vienna");
        placesToVisit.add("Budapest");
        placesToVisit.add("Salzburg");
        printList(placesToVisit);

        //Adding a city
        placesToVisit.add(4,"Zurich");
        printList(placesToVisit);

        //Remove a city
        placesToVisit.remove(4);
        printList(placesToVisit);*/

        //Using the method addInOrder, the city's are printed in alphabetical order.
        addInOrder(placesToVisit, "Zurich");
        addInOrder(placesToVisit, "Barcelona");
        addInOrder(placesToVisit, "Ibiza");
        addInOrder(placesToVisit, "Paris");
        addInOrder(placesToVisit, "London");
        addInOrder(placesToVisit, "Bruges");
        addInOrder(placesToVisit, "Prague");
        addInOrder(placesToVisit, "Berlin");
        addInOrder(placesToVisit, "Venice");
        addInOrder(placesToVisit, "Rome");
        addInOrder(placesToVisit, "Vienna");
        addInOrder(placesToVisit, "Budapest");
        addInOrder(placesToVisit, "Salzburg");
        addInOrder(placesToVisit, "Salzburg"); //duplicate entry
        printList(placesToVisit);

        visit(placesToVisit);

    }

    //Prints the Linked List
    private static void printList(LinkedList<String> linkedList) {
        /*An iterator is another way of accessing and going through all entries in an
        * array, array list, linked list, e.t.c.*/
        /*Iterator is the equivalent of a for loop.
        * i.hasNext() is there another entry?
        * i.next() go to the next entry.*/
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());

        }
        System.out.println("----------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        /*This sets up a List iterator (a special iterator) but it is not pointing to an entry.
        * This is the job of the .next() code below it.*/
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            /*.compareTo is taking the newCity value and comparing it to the values stored in the linked list.
            * The value 0 if the argument is a string lexicographically equal to this string;
            * a value less than 0 if the argument is a string lexicographically greater than this string;
            * and a value greater than 0 if the argument is a string lexicographically less than this string.*/
            if (comparison == 0) {
                /*They are equal and do not add them.*/
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if (comparison > 0) {
                /*The new city passed in the parameter should appear before this one.
                * but the Iterator already moved to the next entry automatically. You need to move
                * back to the previous entry and then add the new city.*/
                /*The List iterator allows us to go back using .previous(). A normal iterator
                * does not have that functionality.*/
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                /*Move onto the next city because nothing needs to be added.
                * The .next() in the List iterator automatically moves onto the next entry
                * so no code is needed.*/
            }
        }

        /*Making it to this point means that there was not a place to add the new entry, so
        * it will be added to the bottom of the list.*/
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation is over!");
                    quit = true;
                    break;
                case 1: /*If the user previously chose to go back a city, these if statements
                        * make sure that you can go to the next entry and actually continue where you left off.
                        * Also checks to see if there is another entry. If there is the print is executed.*/
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    /*If the user previously chose to go forward a city, these if statements
                    * make sure that you can go to the previous entry and continue where you left off.
                    * If it wasn't for the goingForward variable and these checks, the linked list would
                    * return duplicates of a city when you are shifting towards going forward or back.*/
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the beginning of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n Enter ");
        System.out.println("0 - Quit\n" +
                            "1 - Go to the next city\n" +
                            "2 - Go to the previous city\n" +
                            "3 - Print Menu Options");
    }


}

/*A link list (which is an alternative to arrays) stores the actual link to the next item in the list
* as well as the actual data. In other words each element in the list actually holds a link to the
* item that follows it, as well as the actual value you're wanting to actually store as well In Java,
* a linked list also has the ability to point to the previous item as well as the next item.
*
* The major advantage is that if you want to add something to a list of links all you have to do is make
* the new addition point to the one that would be after it and make the one before it point to itself. This
* is more efficient than having to move all the items one position down like arrays do.
*
* Same thing can be said about removing items in a linked list. You need to make the item before the
* item you are removing point to the one after it and Java will automatically destroy it using garbage collection.*/

/* Java will allocate 4 bytes of memory for each integer because it needs up to that amount
* to be able to store the highest value integer.
*
* Java uses a formula to figure out which physical memory address to use to grab the value.
* Int will use 4 bytes of memory.
* Double will use 8 bytes of memory.
*
* Index     Address     Value
* 0         100         34
* 1         104         18
* 2         108         91
* 3         112         57
* 4         116         453
* 5         120         68
* 6         124         6
*
* Strings do not work the same way. The memory that is allocated in the array is eight bytes and
 * it points to another location in memory where the string is. By doing this, Java can keep track of the
 * Strings that are in the array and also can each be different links unlike int which has to be 4 bytes.
 * For strings, there is an index, address, then a String address which points to the actual address that has
 * the string stored.
 * Index    Address     String Address      Address     Done
 * 0        100         1034                1024        Hello World
 * 1        108         1024                1034        Java
 * Prints:
 * Java
 * Hello World*/