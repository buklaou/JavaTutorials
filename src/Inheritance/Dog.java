package Inheritance;

/**
 * Created by Raffi on 12/27/2015.
 */

//If you want to inherit another class you use extends
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //You need to make a constructor for the Dog class that calls the constructor in Animal
    //super means calls a constructor from the class you're extending from
    //All dogs have a brain and a body so you don't need to define those in dog, replace by using 1's
    //then initialize all the fields in Dog under the super( ) line
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
        super.eat(); //call the super class equivalent of eat()
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
