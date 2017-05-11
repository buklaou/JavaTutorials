package Section12.Collections.Section03.ImmutableClasses;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raffi
 */
public class Location2 {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;


    public Location2(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
