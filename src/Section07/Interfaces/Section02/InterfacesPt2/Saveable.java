package Section07.Interfaces.Section02.InterfacesPt2;

import java.util.List;

/**
 * @author Raffi
 */
public interface Saveable {

    List<String> write();
    void read(List<String> savedValues);
}
