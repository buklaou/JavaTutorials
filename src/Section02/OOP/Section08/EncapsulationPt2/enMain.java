package Section02.OOP.Section08.EncapsulationPt2;

/**
 * @author Raffi
 */
public class enMain {

    public static void main(String[] args) {

        Printer printer = new Printer(0,true);

        printer.fillUpToner(10);
        printer.printingPage(4);
        printer.printingPage(2);
        printer.fillUpToner(20);
        printer.printingPage(4);
        printer.printingPage(4);
        printer.printingPage(4);
        printer.fillUpToner(110);


    }


}
