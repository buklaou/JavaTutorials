package Section08.InnerClasses.Section02.InnerClassesPt2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Raffi
 */
public class Albums {

    private String name;
    private String artist;
    private TrackList tracks;

    public Albums(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.tracks = new TrackList();
    }

    /*Adds a track if the title is not a duplicate.*/
    public boolean addTrack(String title, double duration) {
        return this.tracks.add(new Tracks(title, duration));
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Tracks> playList) {
       Tracks checkedTrack = this.tracks.findTrack(trackNumber);
        if(checkedTrack != null) {
            playList.add(checkedTrack);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Tracks> playList) {
       Tracks checkedSong = tracks.findTrack(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The track " + title + " is not in this album.");
        return false;
    }

    /*Inner Class*/
    private class TrackList {
        private ArrayList<Tracks> tracks;

        public TrackList() {
            this.tracks = new ArrayList<>();
        }

        public boolean add(Tracks track) {
            if(tracks.contains(track)) {
                return false;
            }
            this.tracks.add(track);
            return true;
        }

        /*This method checks entries in the array list to find a track.*/
        private Tracks findTrack(String title) {
        /*This is the for-each loop.
        * It creates variable called checkedTrack for every entry in the array list.*/
            for (Tracks checkedTrack : this.tracks) {
                if (checkedTrack.getTitle().equals(title)) {
                    return checkedTrack;
                }
            }
            return null;
        }


        public Tracks findTrack(int trackNumber) {
            int index = trackNumber - 1;
            if((index > 0) && (index < tracks.size())) {
                return tracks.get(index);
            }
            return null;
        }
    }

}
