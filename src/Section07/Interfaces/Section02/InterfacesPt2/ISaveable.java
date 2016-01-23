package Section07.Interfaces.Section02.InterfacesPt2;

import java.util.List;

/**
 * Created by Raffi on 1/22/2016.
 */
public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
