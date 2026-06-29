package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

    public static void mapDemo(String name, int age) {

        /* ==========================================
         * 1. Declaration
         * ========================================== */
        HashMap<String, Integer> map = new HashMap<>();


        /* ==========================================
         * 2. Inserting Elements
         * put(key, value)
         * If key already exists, its value is updated.
         * ========================================== */

        map.put("Arko", 20);
        map.put(name, age);


        /* ==========================================
         * 3. Updating a Value
         * ========================================== */

        map.put("Arko", map.get("Arko") + 1);

        // Better (safe) way for frequency counting
        map.put("Sailen", map.getOrDefault("Sailen", 0) + 1);


        /* ==========================================
         * 4. Size
         * ========================================== */

        System.out.println("Size : " + map.size());


        /* ==========================================
         * 5. Printing Entire HashMap
         * ========================================== */

        System.out.println(map);


        /* ==========================================
         * 6. Accessing Value
         * get(key)
         * Returns null if key is absent.
         * ========================================== */

        System.out.println(map.get("Arko"));

        System.out.println(map.get("Unknown"));   // null


        /* ==========================================
         * 7. Check if Key Exists
         * ========================================== */

        System.out.println(map.containsKey("Arko"));     // true
        System.out.println(map.containsKey("ABC"));      // false


        /* ==========================================
         * 8. Removing an Entry
         * ========================================== */

        // map.remove("Arko");


        /* ==========================================
         * 9. Iterate using keySet()
         *
         * keySet() returns a Set containing all keys.
         * We use each key to retrieve its value.
         * ========================================== */

        System.out.println("\nUsing keySet():");

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }


        /* ==========================================
         * 10. Iterate using entrySet() (Recommended)
         *
         * entrySet() returns key-value pairs.
         * Faster because value lookup isn't needed.
         * ========================================== */

        System.out.println("\nUsing entrySet():");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        /* ==========================================
         * 11. Iterate over Values only
         * ========================================== */

        System.out.println("\nValues:");

        for (Integer value : map.values()) {
            System.out.println(value);
        }


        /* ==========================================
         * 12. Useful DSA Methods
         * ========================================== */

        System.out.println(map.getOrDefault("Rahul", 0));

        map.put("Rahul", map.getOrDefault("Rahul", 0) + 1);

        // One-line frequency update
        map.merge("Rahul", 1, Integer::sum);

        // Creates value if absent
        // Useful in Graphs / Grouping problems
        // map.computeIfAbsent(key, k -> new ArrayList<>());
    }

    public static void main(String[] args) {

        mapDemo("Sailen", 24);

    }
}