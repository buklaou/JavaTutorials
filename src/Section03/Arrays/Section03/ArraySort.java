package Section03.Arrays.Section03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Raffi
 */
public class ArraySort {

    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values.\r");

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

       /* int[] sortedArray = new int[array.length];

        //copies contents of array into sortedArray
        for(int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }*/

        //This method of copying an array is build into java
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        //While loop will execute as long as the flag value is true.
        //For loop goes through numbers in array and if the first element is less than the second, they are swapped.
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }
}
