package Section08.InnerClasses.Section02.InnerClassesPt2;

/**
 * Created by Raffi on 1/22/2016.
 */
public class Tracks {

        private String title;
        private double duration;

        public Tracks(String title, double duration) {
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

