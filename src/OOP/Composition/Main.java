package OOP.Composition;

/**
 * Created by Raffi on 12/27/2015.
 */
public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("Phantom 530", "NZXT", "700", dimensions);
        Monitor monitor = new Monitor("144hz", "ASUS", 24, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("MAXIMUS", 4, "ASUS", 6, "v42");

        PC thePC = new PC(theCase,monitor,motherboard);
        /*thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();*/
        thePC.powerUp();
    }
}
