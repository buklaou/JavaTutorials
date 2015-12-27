package Classes;

/**
 * Created by Raffi on 12/26/2015.
 */
public class Main {

    public static void main(String[] args) {

        //porsche and ferrari are instances of the class Car
        Car porsche = new Car();
        Car ferrari = new Car();



        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());


    }
}
