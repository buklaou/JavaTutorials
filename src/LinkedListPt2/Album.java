package LinkedListPt2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Raffi on 1/18/2016.
 */
public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    /*Adds a song if the title is not a duplicate.*/
    public  boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    /*This method checks entries in the array list to find a song.*/
    private Song findSong(String title) {
        /*This is the for-each loop. It creates variable called checkedSong for every entry in the array list. */
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        /*Internally, the index needs to start at 0. (Hence the minus 1)*/
        int index = trackNumber - 1;
        /*If there is a song at the index position for this array list, the song object will be added to the playlist
         * that was passed as a parameter. */
        if((index > 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }


}
