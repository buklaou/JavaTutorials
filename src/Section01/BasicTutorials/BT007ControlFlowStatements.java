package Section01.BasicTutorials;

/**
 * @author Raffi
 */
public class BT007ControlFlowStatements {

    public static void main(String[] args) {

        /* int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");

        } else
            System.out.println("Value wasn't 1 or 2"); */



        //The switch statement is more efficient than above code
        //int switch statement
        int switchValue = 3;

        //Create possible cases that the value stored in switchValue can match to. (Matches with case 3)
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was 3, 4, or 5");
                System.out.println(switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }


        //Create a char switch statement
        char charValue = 'D';

        switch(charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        /*String switch statement
         * .toLowerCase converts entire string to lowercase so uppercase letters
         * do not interfere with result.*/
        String stringValue = "JANuary";
        switch(stringValue.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
        }
    }


}
