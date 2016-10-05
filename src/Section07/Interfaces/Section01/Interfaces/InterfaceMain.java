package Section07.Interfaces.Section01.Interfaces;

/**
 * @author Raffi
 */
public class InterfaceMain {

    public static void main(String[] args) {

        /*Using the implementation of ITelephone as a data type, you can create instances
        * of it using the same variable name.*/

        ITelephone raffisPhone;
        raffisPhone = new Phone(123456);
        raffisPhone.powerOn();
        raffisPhone.callPhone(123456);
        raffisPhone.answer();
        System.out.println("------------------");
        raffisPhone = new MobilePhone(654321);
        raffisPhone.powerOn();
        raffisPhone.callPhone(654321);
        raffisPhone.answer();

    }
}
