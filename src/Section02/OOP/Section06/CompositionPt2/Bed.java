package Section02.OOP.Section06.CompositionPt2;

/**
 * @author Raffi
 */
public class Bed {

    private int length;
    private int width;
    private String material;

    public Bed(int length, int width, String material) {
        this.length = length;
        this.width = width;
        this.material = material;
    }

    public void clean() {
        System.out.println("Bed is clean.");
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }
}
