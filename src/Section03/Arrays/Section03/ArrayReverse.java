package Section03.Arrays.Section03;
import java.util.*;
import java.util.Scanner;

/**
 * @author Raffi
 */

public class ArrayReverse {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int arraySize = scanner.nextInt();
        if (arraySize >= 1 && arraySize <= 1000) {
            int[] array = getIntegers(arraySize);
            int[] sorted = sortIntegers(array);
            printArray(sorted);
        }
    }

    private static int[] getIntegers(int number) {

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortArray = Arrays.copyOf(array, array.length);
        int temp;
        for (int i = 0; i < sortArray.length / 2; i++) {
            temp = sortArray[i];
            sortArray[i] = sortArray[sortArray.length - i - 1];
            sortArray[sortArray.length - i - 1] = temp;
        }

        return sortArray;
    }

    private static void printArray(int[] array) {

        if (array.length >= 1) {
            System.out.print(array[0]);
        }

        for (int i = 1; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

    }
}
