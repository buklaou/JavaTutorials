package Section12.Collections.Section03.ImmutableClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Raffi
 */
public class AdventureMain2 {

    private static Map<Integer, Location2> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> temporaryExit = new HashMap<>();
        locations.put(0, new Location2(0, "You are sitting in front of a computer.", temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("W",2);
        temporaryExit.put("E", 3);
        temporaryExit.put("S", 4);
        temporaryExit.put("N", 5);
        locations.put(1, new Location2(1, "You are standing in a room.",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("N", 5);
        locations.put(2, new Location2(2, "You are standing outside.",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("W", 1);
        locations.put(3, new Location2(3, "You are sitting in a car.",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("N", 1);
        temporaryExit.put("W", 2);
        locations.put(4, new Location2(4, "You are in a store.",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("S", 1);
        temporaryExit.put("W", 2);
        locations.put(5, new Location2(5, "You are at work.",temporaryExit));

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
