package Section12.Collections.Section02.Maps.Section02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raffi
 */
public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;


    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    public void addExit(int location, String direction) {
        exits.put(direction, location);
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
