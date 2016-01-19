package LinkedListPt2;

/**
 * Created by Raffi on 1/18/2016.
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
