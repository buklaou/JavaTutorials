package Section07.Interfaces.Section01.Interfaces;

/**
 * Created by Raffi on 1/22/2016.
 */
/*Name new Interface file names starting with an I.*/
public interface ITelephone {

    /*These are the methods a class will implement from this interface.
    * public and private are redundant in interfaces.*/

    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}