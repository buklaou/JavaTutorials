package OOP.OOPProject;

/**
 * Created by Raffi on 12/31/2015.
 */
public class OOPMain {

    public static void main(String[] args) {
                                            //price, Bun type meat, tomatoes, lettuce, spread, chili peppers
        Menu order = new Menu(new Hamburger(3,"White",true,true,true,true,true));
        order.totalHamburgerPrice();

        System.out.println();

        Menu order2 = new Menu(new HealthyHamburger(true,true,false,false,false,false,false));
        order2.totalHealthyHamburgerPrice();


        System.out.println();

        Menu order3 = new Menu(new DeluxeHamburger());

    }

}
