package Section02.OOP.Section04.InheritancePt2;

/**
 * @author Raffi
 */
public class GTR extends Car {

    private int roadServiceMonths;

    public GTR(int roadServiceMonths) {
        super("GTR", "AWD", 1, 1, 6, 4, 2, false, 1);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void boost(boolean boost) {
        System.out.println("GTR.boost() called.");
        if (boost == true) {
            addSpeed(10);

        }
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeCurrentGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeCurrentGear(3);
        } else {
            changeCurrentGear(4);
        }


        if (newVelocity > 0) {

            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
