package OOPProject;

/**
 * Created by Raffi on 12/31/2015.
 */
public class HealthyHamburger extends Hamburger {

    private boolean onions;
    private boolean pickles;

    public HealthyHamburger(boolean meat, boolean tomato, boolean lettuce, boolean spread, boolean chiliPeppers,
                            boolean onions, boolean pickles) {
        super(4.75, "Wheat", meat, tomato, lettuce, spread, chiliPeppers);
        this.onions = onions;
        this.pickles = pickles;

    }


    @Override
    public void addToppings(int totalAddOns) {

        totalAddOns = 0;

        double price = getPrice();

        if (this.onions) {
            totalAddOns++;
            System.out.println("Number of toppings: " + totalAddOns);
            price += 0.25;
            setPrice(price);
            System.out.println("Added onions to your burger. Total is now $" + getPrice() + ".");
        }

        if (this.pickles) {
            totalAddOns++;
            System.out.println("Number of toppings: " + totalAddOns);
            price += 0.25;
            setPrice(price);
            System.out.println("Added pickles to your burger. Total is now $" + getPrice() + ".");
        }
        super.addToppings(totalAddOns);

    }
}
