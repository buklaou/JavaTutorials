package OOP.Composition;

/**
 * Created by Raffi on 12/27/2015.
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
