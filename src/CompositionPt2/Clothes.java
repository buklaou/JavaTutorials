package CompositionPt2;

/**
 * Created by Raffi on 12/28/2015.
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
