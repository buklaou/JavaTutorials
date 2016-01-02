package OOP.OOPProject;

/**
 * Created by Raffi on 12/31/2015.
 */
public class Menu {

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
