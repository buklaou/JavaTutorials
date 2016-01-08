package Arrays.Arrays;

import java.util.Scanner;

/**
 * Created by Raffi on 1/1/2016.
 */
public class ArrayMain {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       /* Placing brackets after int translates to the creation of an array.
        All arrays start at position number 0. There are 10 elements in the myVariable array *//*
        int[] myIntArray = new int[10]; //this is another way of initializing an array {1,2,3,4,5,6,7,8,9,10};


        for(int i = 0; i < 10; i++) {
            myIntArray[i] = i * 10;
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }*/

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i<myIntegers.length; i++) {

            System.out.println("Element " + i + ", value is " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));


    }

    //This method gets numbers from the user.
    public static int[] getIntegers(int number) {

        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //This method finds the average of the numbers the user entered.
    public static double getAverage(int[] array) {

        int sum = 0;
        for(int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        return (double) sum/(double)array.length;
    }

}
