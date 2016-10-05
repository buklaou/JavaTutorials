package Section02.OOP.Section06.CompositionPt2;

/**
 * @author Raffi
 */
public class Bedroom {

    private Bed bed;
    private Table table;
    private Closet closet;

    public Bedroom(Bed bed, Table table, Closet closet) {
        this.bed = bed;
        this.table = table;
        this.closet = closet;
    }

    public void clean() {
        closet.clean();
        table.clean();
        bed.clean();
        code();
    }

    private void code() {
        table.turnComputerOn();

    }

    public Bed getBed() {
        return bed;
    }

    public Table getTable() {
        return table;
    }

    public Closet getCloset() {
        return closet;
    }
}
