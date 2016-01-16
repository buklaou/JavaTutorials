package OOP.Inheritance;

/**
 * Created by Raffi on 12/27/2015.
 */
public class Main {

    public static void main(String[] args) {

        //Animal object.
        Animal animal = new Animal(1, 1, 5, 5, "Animal");

        //Dog object.
        Dog dog = new Dog(8, 30, "Shepard", 2, 4, 1, 20, "brown");

        //eat is defined in the Animal class but you can inherit it using Dog.
        dog.eat();
        dog.walk();
        dog.run();

        //Fish object.
        Fish fish = new Fish(1,1,"Nemo",2,2,2);




    }

}
