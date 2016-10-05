package Section09.AbstractClasses.Section01.AbstractClasses;

/**
 * @author Raffi
 */

/*Abstract classes that define methods but do not provide an implementation of those methods.
* The implementation itself is left to the classes that inherit from the abstract class.
* Abstract Classes:
* 1. Can have member variables that are inherited.
* 2. Can have constructors.
* 3. Methods can have any visibility.
* 4. Can have defined methods.
*
* Interfaces:
* 1. Can have variables but they are all public static final variables (constant values that should never change
* with a static scope). Must be static because non static variables require an instance and you can't instanstiate an
* interface.
* 2. All methods are automatically public
* 3. All methods are abstract. All the code must be written in the class that implements the interface.*/

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog("German Shepard");
        dog.breathe();
        dog.eat();

        Eagle eagle = new Eagle("Bald Eagle");
        eagle.breathe();
        eagle.eat();
        eagle.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }

}
