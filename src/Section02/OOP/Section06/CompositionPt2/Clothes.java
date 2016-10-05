package Section02.OOP.Section06.CompositionPt2;

/**
 * @author Raffi
 */
public class Clothes {

    private String type;
    private int howMany;
    private String color;

    public Clothes(String type, int howMany, String color) {
        this.type = type;
        this.howMany = howMany;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public int getHowMany() {
        return howMany;
    }

    public String getColor() {
        return color;
    }
}
