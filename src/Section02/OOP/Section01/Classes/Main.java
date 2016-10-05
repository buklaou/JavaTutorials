package Section02.OOP.Section01.Classes;

/**
 * @author Raffi
 */
public class Main {

    public static void main(String[] args) {

        //porsche and ferrari are instances of the class Car.
        Car porsche = new Car();
        Car ferrari = new Car();



        porsche.setModel("911");
        ferrari.setModel("F12");
        System.out.println("Model is " + porsche.getModel());


    }
}
