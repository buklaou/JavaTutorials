package Section02.OOP.Section07.Encapsulation;

/**
 * @author Raffi
 */
public class EnhancedGamer {

    //These fields aren't accessible to any other classes because they are set to private.
    private String name;
    private int hitPoints = 100;
    private String weapon;

    /*Encapsulation provides validation to make sure that unwanted changes aren't made.
    * Initializing the health variable stores the passed value in health instead of hitpoints and this means
    * that no one else will know that the actual variable that health passes onto is hitpoints.*/
    public EnhancedGamer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }


    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the gamer
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
