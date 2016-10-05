package Section09.AbstractClasses.Section01.AbstractClasses;

/**
 * @author Raffi

 */

/*This class extends the abstract Bird class.*/
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName() + " is not good at that. It will go for a swim.");
    }
}
