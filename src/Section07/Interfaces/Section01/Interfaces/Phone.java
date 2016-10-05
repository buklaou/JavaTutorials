package Section07.Interfaces.Section01.Interfaces;

/**
 * @author Raffi
 */

/*In order for this class to use the Telephone interface, you use implements.*/
public class Phone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public Phone(int myNumber) {
        this.myNumber = myNumber;
    }

    /*Pressing (shortcut) Ctrl + I can implement all the methods found in the interface.*/

    @Override
    public void powerOn() {
        System.out.println("Phone powering up.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on phone.");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring!");
        } else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}