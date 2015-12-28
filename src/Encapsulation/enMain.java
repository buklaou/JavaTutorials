package Encapsulation;

/**
 * Created by Raffi on 12/28/2015.
 */
public class enMain {
    public static void main(String[] args) {

        /*Gamer gamer = new Gamer();

        gamer.name = "Raffi";
        gamer.health = 100;
        gamer.weapon = "Gun";

        int damage = 10;
        gamer.loseHealth(damage);
        System.out.println("Remaining health = " + gamer.healthRemaining());

        damage = 91;
        gamer.loseHealth(damage);
        System.out.println("Remaining health = " + gamer.healthRemaining());*/

        EnhancedGamer gamer = new EnhancedGamer("Raffi", 50, "Gun");
        System.out.println("Initial health is " + gamer.getHealth());


    }
}
