package BasicTutorials;

/**
 * Created by Raffi on 12/26/2015.
 */
public class BT007ControlFlowStatementsPt2 {

    public static void main(String[] args) {

        /*System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0,3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0,4.0));

        //for statements loop initialized variable until terminated.
        //first part in for loop is initialization, second is termination, third is incrementation
        for(int i = 0; i <= 5; i++) {
            System.out.println("Loop " + i + " hello!");

        }

        for(int i = 2; i <= 8; i++) {
            System.out.println(calculateInterest(10000, i));

        }

        for(int i = 8; i >= 2; i--) {
            System.out.println(calculateInterest(10000, i));

        }*/

        /*Uses method isPrime to find prime number in the range of 10 and 50 but exits when
        * count reaches 3.*/
        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
            if(count == 3) {
                System.out.println("Exiting...");
                break;
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/ 100.0));
    }










}
