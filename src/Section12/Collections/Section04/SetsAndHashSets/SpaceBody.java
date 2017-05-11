package Section12.Collections.Section04.SetsAndHashSets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raffi
 */
public abstract class SpaceBody {

    private final double orbitalPeriod;
    private final Set<SpaceBody> satellites;
    private final Key key;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public SpaceBody(String name, double orbitalPeriod, BodyTypes bodytype) {
        this.orbitalPeriod = orbitalPeriod;
        this.key = new Key(name, bodytype);
        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(SpaceBody moon) {

        return this.satellites.add(moon);

    }

    public Set<SpaceBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object instanceof SpaceBody) {
            SpaceBody theObject = (SpaceBody) object;
           return  this.key.equals(theObject.getKey());
        }

        return false;
    }


    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyTypes){
            this.name = name;
            this.bodyType = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object object) {
            Key key = (Key) object;
            if(this.name.equals(key.getName())) {
                return(this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }

    }








}
