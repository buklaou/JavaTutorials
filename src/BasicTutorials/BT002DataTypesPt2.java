package BasicTutorials;

/**
 * Created by Raffi on 12/23/2015.
 */
public class BT002DataTypesPt2 {

    public static void main(String[] args) {

        //width of int = 32 (4 bytes)
        //width of float = 32 (4 bytes)
        //width of double = 64 (8 bytes)

        int myIntValue = 5/3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d/ 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);


        //Convert given number of pounds to kilograms
        //Note: 1 pound = 0.45359237 kilograms
        double p = 15d;
        double k = p * 0.45359237d;
        System.out.println(k);



    }
}
