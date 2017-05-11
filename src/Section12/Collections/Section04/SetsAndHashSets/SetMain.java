package Section12.Collections.Section04.SetsAndHashSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Raffi
 */
public class SetMain {

    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i<= 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

      /*  for(Integer ints : cubes) {
            System.out.println(ints);
        }*/

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");

        for(Integer ints : intersection) {
            System.out.println(ints + " is the square of " + Math.sqrt(ints) + " and the cube of " + Math.cbrt(ints));
        }


        Set<String> words = new HashSet<>();
        String sentence = "one day";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "er", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);

        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature.");

        } else {
            System.out.println("divine is not a subset of nature.");
        }

        if(nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of nature.");
        }




    }

    public static void printSet(Set<String> set) {

        System.out.println("\t");
        for(String setElements : set) {
            System.out.println(setElements + " ");
        }

        System.out.println();
    }
}
