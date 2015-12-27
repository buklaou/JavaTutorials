/**
 * Created by Raffi on 12/26/2015.
 */
public class Methods {

    public static void main(String[] args) {

        //Send data by typing arguments to match the calculateScore parameters
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        /*Another solution by giving the values to variables in main and passing variable names to the method
        rather than the numbers themselves. You can also set a methods return result to a variable in main
        and print out that variable.*/

       /* boolean gameisOver = true;
        int yourScore = 800;
        int levelComplete = 5;
        int yourBonus = 100;

        calculateScore(gameisOver, yourScore, levelComplete, yourBonus);

        gameisOver = true;
        yourScore = 10000;
        levelComplete = 8;
        yourBonus = 200;
        calculateScore(gameisOver, yourScore, levelComplete, yourBonus);*/

        displayHighScorePosition("Raffi", calculateHighScorePosition(1500));
        displayHighScorePosition("Raffi", calculateHighScorePosition(900));
        displayHighScorePosition("Raffi", calculateHighScorePosition(400));
        displayHighScorePosition("Raffi", calculateHighScorePosition(50));

    }

    //This method calculates a finalScore by receiving these parameters
    //void means do not return anything, but if you want it to return something you need to change it to the
    //data type that it will be returned as
    public static void calculateScore(boolean gameisOver,int yourScore, int levelComplete, int yourBonus) {

        if(gameisOver) {
            int finalScore = yourScore + (levelComplete * yourBonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position " + highScorePosition
                            + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500 && playerScore <= 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore <= 500) {
            return 3;
        } else
            return 4;


    }
}
