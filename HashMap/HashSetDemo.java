package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

    public static void hashSetDemo(int number, String name) {

        /*
         * ==========================
         * HashSet Basics
         * - Stores only unique elements
         * - Does NOT maintain insertion order
         * - Average Time Complexity:
         *      add()      -> O(1)
         *      remove()   -> O(1)
         *      contains() -> O(1)
         * ==========================
         */

        // -------------------------
        // 1. Declaration
        // -------------------------
        HashSet<Integer> intSet = new HashSet<>();
        HashSet<String> stringSet = new HashSet<>();


        // -------------------------
        // 2. Adding Elements
        // -------------------------
        intSet.add(number);
        intSet.add(20);
        intSet.add(30);
        intSet.add(40);

        stringSet.add(name);
        stringSet.add("Mondal");


        // -------------------------
        // 3. Printing the HashSets
        // -------------------------
        System.out.println("Integer Set : " + intSet);
        System.out.println("String Set  : " + stringSet);


        // -------------------------
        // 4. Removing an Element
        // -------------------------
        intSet.remove(30);

        System.out.println("\nAfter Removing 30:");
        System.out.println(intSet);


        // -------------------------
        // 5. Searching an Element
        // -------------------------
        System.out.println("\nDoes 20 exist? -> " + intSet.contains(20));


        // -------------------------
        // 6. Traversing the HashSet
        // -------------------------
        System.out.print("\nElements : ");

        for (int value : intSet) {
            System.out.print(value + " ");
        }

        System.out.println();


        // -------------------------
        // 7. Size
        // -------------------------
        System.out.println("\nSize : " + intSet.size());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        // Method Call
        hashSetDemo(number, name);

        sc.close();
    }
}