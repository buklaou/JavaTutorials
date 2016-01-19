package LinkedListPt2;

import java.util.*;
import java.util.jar.Pack200;

/**
 * Created by Raffi on 1/18/2016.
 */
public class LinkedMainPt2 {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Bangarang", "Skrillex");
        album.addSong("Kyoto", 3.21);
        album.addSong("Right In", 3.01);
        album.addSong("Summit", 6.14);
        album.addSong("Bangarang", 3.35);
        albums.add(album);

        album = new Album("Recess", "Skrillex");
        album.addSong("Ease My Mind", 5.03);
        album.addSong("Try It Out", 3.49);
        album.addSong("Recess", 3.58);
        albums.add(album);

        /*The playlists are stored in an linked list. The albums are stored in an array list.*/
        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Summit", playList);
        albums.get(0).addToPlaylist("Kyoto", playList);
        albums.get(0).addToPlaylist("Ease My Mind", playList);
        albums.get(0).addToPlaylist(4, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No songs in playlist.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Quitting..");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("Beginning of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Beginning of the playlist.");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions: \n Enter ");
        System.out.println("0 - Quit\n" +
                "1 - Next track.\n" +
                "2 - Last track.\n" +
                "3 - Replay current track.\n" +
                "4 - List tracks in current playlist.\n" +
                "5 - Print available actions.");
    }

    public static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("------------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("------------------------");
    }


}
