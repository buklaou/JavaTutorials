package Section02.OOP.Section03.Inheritance;

/**
 * @author Raffi
 */

//To inherit another class you need to use the extends keyword.
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    /*You must create a constructor for the Dog class. This calls the constructor in the Animal class.
    * The super keyword means that it calls the constructor from the class you are extending from.
    * All dogs have a brain and body so you can replace them with the number 1 because you don't need to
    * define them here.
    * You should initialize all the new fields created under the Dog class after the super() line.*/
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    //Overriding a method in the super class (Animal class)
    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat(); //This calls the super class equivalent of eat().
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called.");
        move(10);
    }

    public void movelegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        movelegs(speed);
        super.move(speed);
    }
}
