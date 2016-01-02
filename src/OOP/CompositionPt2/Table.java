package OOP.CompositionPt2;

/**
 * Created by Raffi on 12/28/2015.
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
