package Section02.OOP.Section05.Composition;

/**
 * @author Raffi
 */
public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;


    public Motherboard(String model, int ramSlots, String manufacturer, int cardSlots, String bios) {

        this.model = model;
        this.ramSlots = ramSlots;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");

    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }


}
