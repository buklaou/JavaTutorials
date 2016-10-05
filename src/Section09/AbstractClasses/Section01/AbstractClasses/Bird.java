package Section09.AbstractClasses.Section01.AbstractClasses;

/**
 * @author Raffi
 */

/*This abstract class extends from the abstract Animal class and implements the CanFly interface.*/
public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings.");
    }
}
