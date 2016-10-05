package Section06.LinkedLists.Section02.LinkedListPt2;

/**
 * @author Raffi
 */
public class Track {

    private String title;
    private double duration;

    public Track(String title, double duration) {
        this.duration = duration;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
