package OOP.Polymorphism;

/**
 * Created by Raffi on 12/30/2015.
 */

//OOP.Polymorphism assigns different functionality to the different types of objects we create.

//This is the main movie class. Includes just a string name field, standard constructor, plot method and getter for name
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

/*Below are five different move classes that have their own constructors which super to main constructor
and have plot methods that return a short string of the plot of each movie.*/
class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Shark eats people.";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }
}

class Inception extends Movie {

    public Inception() {
        super("Inception");
    }

    @Override
    public String plot() {
        return "Control dreams.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe.";
    }
}

class StarTrek extends Movie {

    public StarTrek() {
        super("Star Trek");
    }

    /*Since there is no Override plot method in this class, java will go back up to the plot method in the Movie class
    * because StarTrek extends from that class. This happens when this movie is randomly selected and when its
    * non-existent plot method is called.*/
}


public class PolyMain {

    public static void main(String[] args) {

        //This for loop creates 10 results of its code block
        for(int i = 1; i <= 10; i++) {

            //the return from randomMove() is stored in movie
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
            "Plot: " + movie.plot() + "\n");

        }
    }

    /*randomMove() method stores a random number in the int variable randomNumber and uses a switch case
      using that random number to return the numbers corresponding movie class*/
    public static Movie randomMovie() {

        //cast int because math.random returns double and we need int
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated is " + randomNumber);

        switch (randomNumber) {

            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new Inception();

            case 4:
                return new StarWars();

            case 5:
                return new StarTrek();


        }

        return null;
    }
}

































