package Section02.OOP.Section11.OOPProject;

/**
 * @author Raffi
 */
public class DeluxeHamburger extends Hamburger {

    private boolean chips;
    private boolean drink;

    public DeluxeHamburger() {
        super(5.75,"White", true, false, false, false, false);
        this.chips = true;
        this.drink = true;
        System.out.println("Added chips and a drink to your deluxe burger. \nTotal is now $" + getPrice() + ".");
    }


}
