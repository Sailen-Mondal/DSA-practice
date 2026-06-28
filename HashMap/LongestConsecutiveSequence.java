package HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    /*
     * Problem:
     * Find the length of the longest consecutive sequence in an unsorted array.
     *
     * Example:
     * Input : [100, 4, 200, 1, 3, 2]
     * Output: 4
     * Explanation: The longest consecutive sequence is [1, 2, 3, 4].
     *
     * Approach:
     * 1. Store all numbers in a HashSet.
     * 2. Only start counting from numbers that DO NOT have a predecessor
     *    (i.e., num - 1 is absent).
     * 3. Expand the sequence by checking num + 1, num + 2, ...
     * 4. Keep track of the maximum sequence length.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     */

    public static int longestConsecutive(int[] nums) {

        // Edge Case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Store all numbers in a HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Iterate over unique elements only
        for (int num : set) {

            // Check if this number is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the longest sequence found so far
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
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

        int answer = longestConsecutive(nums);

        System.out.println("\nLongest Consecutive Sequence Length = " + answer);

        sc.close();
    }
}