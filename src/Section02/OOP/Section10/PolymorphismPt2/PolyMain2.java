package Section02.OOP.Section10.PolymorphismPt2;

/**
 * Created by Raffi on 12/30/2015.
 */

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;

    }

    public String startEngine() {
        return ("Engine has started.");

    }

    public String accelerate() {
        return ("Accelerating...");
    }

    public String brake() {
        return ("Slowing down...");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

class Jaguar extends Car {

    public Jaguar(String name, int cylinders){
        super(name, cylinders);
    }
    @Override
    public String startEngine() {
        return "Jaguar engine started.";
    }

    @Override
    public String accelerate() {
        return "Jaguar accelerating.";
    }

    @Override
    public String brake() {
        return "Jaguar slowing down.";
    }
}

class Koenigsegg extends Car {

    public Koenigsegg(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Koenigsegg engine started.";
    }

    @Override
    public String accelerate() {
        return "Koenigsegg accelerating.";
    }

    @Override
    public String brake() {
        return "Koenigsegg slowing down.";
    }
}

class Porsche extends Car {

    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Porsche engine started.";
    }

    @Override
    public String accelerate() {
        return "Porsche accelerating.";
    }

    @Override
    public String brake() {
        return "Porsche slowing down.";
    }
}

 class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford engine started.";
    }

    @Override
    public String accelerate() {
        return "Ford accelerating.";
    }

    @Override
    public String brake() {
        return "Ford slowing down.";
    }
}

public class PolyMain2 {

    public static void main(String[] args) {

        Car car = new Car("Koenigsegg One:1", 8);
        System.out.println(car.getName());
        System.out.println(car.getCylinders());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Jaguar jaguar = new Jaguar("FType R", 8);
        System.out.println(jaguar.getName());
        System.out.println(jaguar.getCylinders());
        System.out.println(jaguar.startEngine());
        System.out.println(jaguar.accelerate());
        System.out.println(jaguar.brake());

        System.out.println();

        Koenigsegg Koenigsegg = new Koenigsegg("One:1", 8);
        System.out.println(Koenigsegg.getName());
        System.out.println(Koenigsegg.getCylinders());
        System.out.println(Koenigsegg.startEngine());
        System.out.println(Koenigsegg.accelerate());
        System.out.println(Koenigsegg.brake());

        System.out.println();

        Porsche porsche = new Porsche("918 Spyder", 8);
        System.out.println(porsche.getName());
        System.out.println(porsche.getCylinders());
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        System.out.println();

        Ford ford = new Ford("Ford GT", 8);
        System.out.println(ford.getName());
        System.out.println(ford.getCylinders());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }


}
