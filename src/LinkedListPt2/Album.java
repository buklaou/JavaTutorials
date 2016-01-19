package LinkedListPt2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Raffi on 1/18/2016.
 */
public class Album {

    private String name;
    private String artist;
    private ArrayList<Track> tracks;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    /*Adds a track if the title is not a duplicate.*/
    public  boolean addTrack(String title, double duration) {
        if(findTrack(title) == null) {
            this.tracks.add(new Track(title, duration));
            return true;
        }
        return false;
    }

    /*This method checks entries in the array list to find a track.*/
    private Track findTrack(String title) {
        /*This is the for-each loop. It creates variable called checkedTrack for every entry in the array list. */
        for(Track checkedTrack: this.tracks) {
            if(checkedTrack.getTitle().equals(title)) {
                return checkedTrack;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Track> playList) {
        /*Internally, the index needs to start at 0. (Hence the minus 1)*/
        int index = trackNumber - 1;
        /*If there is a track at the index position for this array list, the track object will be added to the playlist
         * that was passed as a parameter. */
        if((index > 0) && (index <= this.tracks.size())) {
            playList.add(this.tracks.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Track> playList) {
        Track checkedTrack = findTrack(title);
        if(checkedTrack != null) {
            playList.add(checkedTrack);
            return true;
        }
        System.out.println("The track " + title + " is not in this album.");
        return false;
    }


}
