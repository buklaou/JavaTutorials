package Section02.OOP.Section11.OOPProject;

/**
 * Created by Raffi on 12/31/2015.
 */
public class Hamburger {

    private String breadRollType;
    private boolean meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean spread;
    private boolean chiliPeppers;
    private double price;

    public Hamburger(double price, String breadRollType, boolean meat, boolean tomato, boolean lettuce, boolean spread,
                     boolean chiliPeppers) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.spread = spread;
        this. chiliPeppers = chiliPeppers;
        this.price = price;
    }

    public void addToppings(int totalAddOns) {

            if (this.tomato) {
                totalAddOns++;
                System.out.println("Number of toppings: " + totalAddOns);
                this.price = price + 0.25;
                System.out.println("Added tomatoes to your burger. Total is now $" + this.price + ".");
            }

            if (this.lettuce) {
                totalAddOns++;
                System.out.println("Number of toppings: " + totalAddOns);
                this.price = price + 0.25;
                System.out.println("Added lettuce to your burger. Total is now $" + this.price + ".");
            }
            if (this.spread) {
                totalAddOns++;
                System.out.println("Number of toppings: " + totalAddOns);
                this.price = price + 0.25;
                System.out.println("Added spread to your burger. Total is now $" + this.price + ".");
            }
            if (this.chiliPeppers) {
                totalAddOns++;
                System.out.println("Number of toppings: " + totalAddOns);
                this.price = price + 0.25;
                System.out.println("Added chili peppers to your burger. Total is now $" + this.price + ".");
            } else if (!this.tomato && !this.lettuce && !this.spread && !this.chiliPeppers) {

                System.out.println("No additional items added. Total is now $" + this.price + ".");
            }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
