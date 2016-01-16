package AutoboxingAndUnboxing;

import java.util.ArrayList;

/**
 * Created by Raffi on 1/15/2016.
 */
public class AutoMain {

    /*Recall that string is a class in java and reference data type.
    * String is a array of character so it is not a primitive data type.
    *
    * So the following code:
    * ArrayList<String> strArrayList = new ArrayList();
    * works because string is not a primitive data type.
    *
    * You cannot create an int version of that same line of code because int is a primitive data type.
    * ArrayList<int> strArrayList = new ArrayList(); <-- not allowed.
    *
    * One way of making an int version of an array list work is by creating a whole class that has
    * a private int field, constructor, getter and setter. Then you could create an array list based off of that class.
    *
    * For example:
    * class IntClass {
    * private int myValue;
    *
    * public IntClass(int myValue) {
    *   this.myValue = myValue;
    *
    * public int getMyValue() {
    *   return myValue;
    *   }
    *
    * public void setMyValue(int myValue) {
    *   this.myValue = myValue;
    *   }
    *
    * You could now create an array list in main:
    * ArrayList<IntClass> intClassArrayList = new ArrayList();
    * intClassArrayList.add(new IntClass(54));
    *
    * An easier way to do this is AutoBoxing.*/
    public static void main(String[] args) {


        /*For integers, you can create a variable integer with the functionality of the Integer/Double classes
        * that are built into Java. These are called Wrapper classes.*/
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25d);
        Long longValue = new Long(123L);
        Short shortValue = new Short((short) 32767);
        Float floatValue = new Float(123);
        Character charValue = new Character('\u00A5');
        Byte byteValue = new Byte((byte) 10);
        Boolean booleanValue = new Boolean(true);


        /*Autoboxing is when you create and convert a base primitive type int to an Integer class.
        * Unboxing is when you convert it from the class or from the object wrapper and converting it back into a
        * primitive type.*/

       /* ArrayList<Integer> intArrayList = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            *//*.valueOf is taking the value of i as the primitive type and converting it so that it can be used
            * by the Integer class.*//*
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            *//*.intValue grabs the Integer class i and converts it back into a primitive type.*//*
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
        }*/

        /*Java has this shortcut which allows you to type this code in and Java compiles it
         * in the form of the comment next to it. */
        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue; //myInt.intValue();


        /*Autoboxing*/
        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            //myDoubleValues.add(Double.valueOf(dbl)); Same code as line below.
            myDoubleValues.add(dbl);
        }

        /*Unboxing*/
        for(int i = 0; i < myDoubleValues.size(); i++) {
            //double value = myDoubleValues.get(i).doubleValue(); Same code as line below.
            double value = myDoubleValues.get(i);
            System.out.println(i + " ---> " + value);
        }


    }
}
