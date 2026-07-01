package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    /*
     * Problem:
     * Find the majority element in an array.
     *
     * A majority element appears more than (n / 2) times.
     * It is guaranteed that a majority element always exists.
     *
     * Example:
     * Input : [2,2,1,1,1,2,2]
     * Output: 2
     *
     * Approach:
     * 1. Count the frequency of every element using a HashMap.
     * 2. Traverse the HashMap.
     * 3. Return the element whose frequency is greater than n / 2.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     */

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the majority element
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }

        // This line is never reached because
        // the problem guarantees a majority element exists.
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int answer = majorityElement(nums);

        System.out.println("\nMajority Element = " + answer);

        sc.close();
    }
}
