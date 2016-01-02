package OOP.Encapsulation;

/**
 * Created by Raffi on 12/28/2015.
 */
public class Gamer {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the gamer
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
