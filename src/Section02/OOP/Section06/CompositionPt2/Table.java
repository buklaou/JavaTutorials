package Section02.OOP.Section06.CompositionPt2;

/**
 * @author Raffi
 */
public class Table {

    private String type;
    private Dimensions dimensions;

    public Table(String type, Dimensions dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public void clean() {
        System.out.println("Table is clean.");
    }

    public void turnComputerOn() {
        System.out.println("Turning on Computer...");

    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
