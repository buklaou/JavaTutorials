package Interfaces;

/**
 * Created by Raffi on 1/22/2016.
 */
public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone powering up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + "on phone.");
        } else {
            System.out.println("Phone is turned off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring!");
        } else {
            isRinging = false;
            System.out.println("Not a mobile phone or incorrect number.");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
