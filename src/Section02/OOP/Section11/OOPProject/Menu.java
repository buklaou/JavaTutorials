package Section02.OOP.Section11.OOPProject;

/**
 * @author Raffi
 */
public class Menu {

    /*Using Composition to define new fields in Menu class.*/
    private Hamburger hamburger;
    private HealthyHamburger healthyHamburger;
    private DeluxeHamburger deluxeHamburger;

    public Menu(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Menu(HealthyHamburger healthyHamburger) {
        this.healthyHamburger = healthyHamburger;
    }

    public Menu(DeluxeHamburger deluxeHamburger) {
        this.deluxeHamburger = deluxeHamburger;
    }


    public void totalHamburgerPrice() {

       hamburger.addToppings(0);
    }

    public void totalHealthyHamburgerPrice() {

        healthyHamburger.addToppings(0);
    }

}
