package Section01.BasicTutorials;

/**
 * Created by Raffi on 12/26/2015.
 */
public class BT007ControlFlowStatementsPt3 {

    //While and Do-While
    public static void main(String[] args) {

        /*int count = 0;
        //While the expression in the while loop is true, execute code in its code block
        while(count != 6 ) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        //Do-While is the opposite. It executes the code in its code block and then checks if the expression is true

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);*/

        int totalEvenNumbersFound = 0;
        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }else

            System.out.println("Even number " + number);
            number++;

            totalEvenNumbersFound++;
            if(totalEvenNumbersFound == 5) {
                break;
            }
            System.out.println("Total even numbers found = " + totalEvenNumbersFound);
        }
    }


    public static boolean isEvenNumber(int n) {

        while(n % 2 == 0){
            return true;
        }

        return false;
    }


}
