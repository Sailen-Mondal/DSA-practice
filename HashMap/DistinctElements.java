package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctElements {

    /*
     * Problem:
     * Count the number of distinct (unique) elements in an array.
     *
     * Approach:
     * - Store every element in a HashSet.
     * - HashSet automatically removes duplicates.
     * - Return the size of the HashSet.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     */

    public static int distinct(int[] arr) {

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add every element into the HashSet
        for (int num : arr) {
            set.add(num);
        }

        // Number of unique elements
        return set.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = distinct(arr);

        System.out.println("Distinct Elements = " + result);

        sc.close();
    }
}