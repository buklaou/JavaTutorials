package Section02.OOP.Section05.Composition;

/**
 * @author Raffi
 */
public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
