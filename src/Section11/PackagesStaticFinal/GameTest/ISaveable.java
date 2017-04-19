package Section11.PackagesStaticFinal.GameTest;

import java.util.List;

/**
 * @author Raffi
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
