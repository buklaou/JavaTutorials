package Section09.AbstractClasses.Section01.AbstractClasses;

/**
 * Created by Raffi on 1/23/2016.
 */

/*This class extends the abstract Animal class.*/
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");

    }
}
