package Section12.Collections.Section02.Maps.Section02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Raffi
 */
public class AdventureMain {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer."));
        locations.put(1, new Location(1, "You are standing in a room."));
        locations.put(2, new Location(2, "You are standing outside."));
        locations.put(3, new Location(3, "You are sitting in a car."));
        locations.put(4, new Location(4, "You are in a store."));
        locations.put(5, new Location(5, "You are at work."));

        locations.get(1).addExit(2, "W");
        locations.get(1).addExit(3, "E");
        locations.get(1).addExit(4, "S");
        locations.get(1).addExit(5, "N");

        locations.get(2).addExit(5, "N");

        locations.get(3).addExit(1, "W");

        locations.get(4).addExit(1, "N");
        locations.get(4).addExit(2, "W");

        locations.get(5).addExit(1, "S");
        locations.get(5).addExit(2, "W");

        Map<String, String> vocab = new HashMap<>();
        vocab.put("NORTH", "N");
        vocab.put("SOUTH", "S");
        vocab.put("WEST", "W");
        vocab.put("EASE", "E");
        vocab.put("QUIT", "Q");


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }

            System.out.println();
            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocab.containsKey(word)) {
                        direction = vocab.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You can't go in that direction.");
            }
        }

    }

}
