package Section10.Generics.Section01;

import java.util.ArrayList;

/**
 * @author Raffi
 */
public class GenericsMain {

    /*Generics allow us to create classes, interfaces and methods that take
    * types as parameters called type parameters.*/

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("test");
        items.add(4);
        items.add(5);

        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println(i * 2);
        }
    }
}
