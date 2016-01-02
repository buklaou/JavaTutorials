package BasicTutorials;

/**
 * Created by Raffi on 12/23/2015.
 */
public class BT002DataTypes {

    public static void main(String[] args) {

        //int has a width of 32
        //int can hold a range of numbers from -2147483648 to 2147483647
        //Since Java 7 you can use underscores to make big numbers more readable
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println(myTotal);

        //BYTE
        //has a width of 8
        //more efficient in regard to space compared to int
        //byte can hold a range of numbers from -128 to 127
        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2); //(byte) makes java treat (myByteValue/2) as a byte rather than an int
        System.out.println(myNewByteValue);

        //SHORT
        //has a width of 16
        //short can hold a range of numbers from -32,768 to 32767
        short myShortValue = 32767;
        short myNewShortValue = (short)(myShortValue/2);
        System.out.println(myNewShortValue);

        //LONG (put L after the number to declare it as long)
        //width of 64
        //long can hold a range of numbers from -9_223_372_036_854_775_808L to 9,223,372,036,854,775,807L
        long myLongValue = 100L;
        long myNewLongValue = (myLongValue/2);
        System.out.println(myNewLongValue);

        /* variables int and long do not require casts */

        //OOP.Constructors
        //create byte, short, int variables with valid numbers stored. Then make a long variable
        //equal to 50000 + 10 times the sum of the other data types.
        byte b = 100;
        short s = 10000;
        int i = 20000;
        long l = 50000 + 10 * (b+s+i);

        System.out.println(l);

    }
}
