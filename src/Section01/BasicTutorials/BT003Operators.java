package Section01.BasicTutorials;

/**
 * Created by Raffi on 12/26/2015.
 */
public class BT003Operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5 ;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3; //% = remainder
        System.out.println(previousResult + " % 3 = " + result); //what is left over after 4/3 = 1


        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        /*Basic if operators are:
        *  ==      !=           >=                         <=                     >             <
        * equals, not equal to, greater than or equal to, less than or equal to, greater than, less than */

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");


        int secondTopScore = 60;
        /*There are two conditions to check separated by && or ||
        * && requires both to be true, || requires only one to be true.*/
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("one of these tests is true");

        boolean isCar = false;
        boolean wasCar = (isCar) ? true : false;
        /*If isCar is true, return true otherwise return false.
        * This sets wasCar to false.*/
        System.out.println(wasCar);


        //Challenge
        double firstValue = 20d;
        double secondValue = 80d;
        double totalValue = (firstValue + secondValue) * 25;
        double remainder = totalValue % 2300;

        if(remainder <= 200)
            System.out.println("Total was over the limit");


    }



}
