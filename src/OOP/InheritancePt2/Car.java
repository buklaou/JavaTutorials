package OOP.InheritancePt2;

/**
 * Created by Raffi on 12/27/2015.
 */
public class Car extends Vehicle {

    private int gears;
    private int wheels;
    private int doors;
    private int currentGear;
    private boolean isManual;

    public Car(String name, String size, int currentVelocity, int currentDirection, int gears, int wheels, int doors, boolean isManual, int currentGear) {
        super(name, size, currentVelocity, currentDirection);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void addSpeed(int boost) {
        System.out.println("Car.addSpeed: Speed increased to " + (boost + getCurrentVelocity()));

    }


    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed,direction);



    }


}

