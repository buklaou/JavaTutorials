package Section06.LinkedLists.Section02.LinkedListPt2;

import java.util.*;

/**
 * Created by Raffi on 1/18/2016.
 */
public class LinkedMainPt2 {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Flume (Deluxe Edition)", "Flume");
        album.addTrack("Sleepless", 5.18);
        album.addTrack("You & Me", 4.43);
        album.addTrack("Insane", 2.07);
        album.addTrack("Ezra", 3.38);
        albums.add(album);

        album = new Album("In Colour", "Jamie XX");
        album.addTrack("Gosh", 4.52);
        album.addTrack("Sleep Sound", 3.52);
        albums.add(album);

        /*The play lists are stored in an linked list. The albums are stored in an array list.*/
        LinkedList<Track> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Sleepless", playList);
        albums.get(0).addToPlaylist("Ezra", playList);
        albums.get(0).addToPlaylist("Insane", playList);
        albums.get(0).addToPlaylist(2, playList);

        play(playList);
    }

    public static void printMenu() {
        System.out.println("Available actions: \n Enter ");
        System.out.println("0 - Quit\n" +
                "1 - Next track.\n" +
                "2 - Last track.\n" +
                "3 - Replay current track.\n" +
                "4 - Remove current track.\n" +
                "5 - List tracks in current playlist.\n" +
                "6 - Print available actions.");
    }

    private static void play(LinkedList<Track> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Track> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No tracks in playlist.");
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
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Beginning of the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of playlist.");
                        }
                    }
                    break;
                case 4:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                        break;
                case 5:
                    printList(playList);
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }


    public static void printList(LinkedList<Track> playList) {
        Iterator<Track> iterator = playList.iterator();
        System.out.println("------------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("------------------------");
    }


}
