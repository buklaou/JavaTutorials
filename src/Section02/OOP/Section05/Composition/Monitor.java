package Section02.OOP.Section05.Composition;

/**
 * @author Raffi
 */
public class Monitor {

    private String model;
    private String manufacturer;
    private int size;

    /*This is an example of composition. The resolution class is part of Monitor.
    * Resolution is now a component of monitor.*/
    private Resolution nativeResolution;


    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
