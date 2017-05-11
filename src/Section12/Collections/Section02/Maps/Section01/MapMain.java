package Section12.Collections.Section02.Maps.Section01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raffi
 */
public class MapMain {

    /*Maps cannot contain duplicate keys and each key maps to a single value.
    * Two classes that implement this interface are HashMap and Linked HashMap.
    * TreeMap implements the sortedMap interface.
    * Maps like all the core collection interfaces are generic. They take two types,
    * one for key and one for value.
    * If you insert another value for a key that exists, it will be overwritten.
    * If a value is being added for the first time, it will print null.*/

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        /*INSERT INTO MAP*/
        languages.put("Java", " a compiled high-level, object-oriented, platform independent language.");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("Lisp", "Therin lies madness");

        System.out.println(languages.get("Java"));


        /*CONTAINS*/
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists.");
        } else {
            languages.put("Java", "Java entry");
        }

        /*REMOVE*/
//        languages.remove("Lisp");
        if(languages.remove("Algol", " a family of algorithmic languages.")) {
            System.out.println("Algol removed.");
        } else {
            System.out.println("Algol not removed, key/value pair not found.");
        }

        /*REPLACE*/
        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features."));
        System.out.println(languages.replace("Scala", "this will not be added."));

        /*PRINT MAP */
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }

}
