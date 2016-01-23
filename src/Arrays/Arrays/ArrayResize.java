package Arrays.Arrays;

import java.util.Scanner;

/**
 * Created by Raffi on 1/1/2016.
 */

public class ArrayResize {
    private static Scanner s = new Scanner(System.in);

    private static int[] baseData = new int[5];

    public static void main(String[] args) {
        System.out.println("Enter 5 integers");
        getInput();
        printArray(baseData);
        resizeArray();
    }


    private static void getInput() {

        for (int i = 0; i < baseData.length; i++) {

            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] array) {

        for (int i = 0; i < baseData.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    private static void resizeArray() {

        int[] original = baseData;
        System.out.println("\nDo you want to resize the array?");
        String x = s.next();
        if (x.equals("yes")) {
            System.out.println("Enter new array size..");

            int resizeAmount = s.nextInt();
            baseData = new int[resizeAmount];
            for (int i = 0; i < original.length; i++)
                baseData[i] = original[i];

            printArray(baseData);
            System.out.println("| Enter new array numbers.");
            getInput();
            printArray(baseData);
        }

    }
}
