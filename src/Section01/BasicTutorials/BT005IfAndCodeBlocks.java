package Section01.BasicTutorials;

/**
 * @author Raffi
 */
public class BT005IfAndCodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        //A code block organizes code in this If test with brackets so that both prints are executed.

        if(score == 5000) {
            System.out.println("You score was 5000");
            System.out.println("This was executed");
        }

        /*if else statement
          if the first one is true it executes the print in the first code block.
          if the second else if is true it executes the print in the second code block.
          if else is true it executes the print in the third code block.*/
        if(score <= 5000 && score > 1000) {
            System.out.println("Your score was less than 500 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        /*Codeblocks can access variables created outside the codeblock
          You can create variables inside a code block, although you cannot access variables
          created in a codeblock from outside the codeblock */

        //Concept of variables in a codeblock is called Scope which deals with accessibility of variables.

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }

        if(gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was " + secondFinalScore);
        }

    }


}
