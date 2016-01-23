package Section08.InnerClasses.Section01.InnerClassesPt1;

import java.util.Scanner;

/**
 * Created by Raffi on 1/22/2016.
 */
public class InnerMain {

    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");

    public static void main(String[] args) {

       /*mcLaren is object of Gearbox class.
        Gearbox mcLaren = new Gearbox(6);
        first is object of the Gear class within the Gearbox class.
        It uses the mcLaren object which represents the outer class to create it.
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));*/

        /*There are two types of inner classes: local and anonymous.
        * This is a local class. A local class is declared within a code block either within
        * a method or if statement. The scope is restricted to that block. They increase encapsulation
        * but are not widely used.*/
        /*class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }

        buttonPrint.setOnClickListener(new ClickListener());*/

        /*This is an anonymous class is like a local class with no name. They have to be declared
        * and instantiated at the same time because they do not have a name. They are used when local
        * classes are only required to be used once.*/
        buttonPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
        listen();
    }

    /*This method quits when 0 is entered and repeatedly prints the buttonPrint's title
    * + " was clicked".*/
    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    buttonPrint.onClick();
            }
        }
    }
}
