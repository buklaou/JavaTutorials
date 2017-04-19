package Section07.Interfaces.Section01.Interfaces;

/**
 * @author Raffi
 */
/*Name new Interface file names starting with an I.*/
public interface ITelephone {

    /*All interface variables are set to public static final. All methods are automatically set to public.*/

    /*These are the methods a class will implement from this interface.
    * public and private are redundant in interfaces.*/

    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}