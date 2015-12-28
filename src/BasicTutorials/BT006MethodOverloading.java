package BasicTutorials;

/**
 * Created by Raffi on 12/26/2015.
 */
public class BT006MethodOverloading {


    //You cannot have the same method with same parameters. Although if you change the
    //parameters it receives then there will be no error.
    public static void main(String[] args) {
        calculateScore("Raffi", 500);
        calculateScore(750);
        calculateScore();

        calcFeetAndInchesToCentimeters(5.0, 10.0);
        calcFeetAndInchesToCentimeters(48.0);
        calcFeetAndInchesToCentimeters(101.0);
    }

    //Notice how these three methods are the same, but the parameters they receive are different.
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + ", score was " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown Player " + ", score was " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return -1;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && feet <= 12 && inches >= 0) {
            double centimeters = ((feet * 12) * 2.54 + (inches * 2.54));
            System.out.println("Centimeters total: " + centimeters);
        }

        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {

            double centimeters = inches * 2.54;
            System.out.println("Centimeters total: " + centimeters);
        }

        return -1;
    }
}
