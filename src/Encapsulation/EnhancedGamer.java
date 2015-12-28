package Encapsulation;

/**
 * Created by Raffi on 12/28/2015.
 */
public class EnhancedGamer {
    //fields aren't accessible to any other classes
    private String name;
    private int hitPoints = 100;
    private String weapon;

    //Encapsulation provides validation to make sure that unwanted changes aren't made.
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
