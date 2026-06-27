package HashMap;

import java.util.HashSet;

public class TwoSum {

    /*
     * Problem:
     * Find two numbers whose sum equals the target.
     *
     * Approach:
     * - Traverse the array once.
     * - For each number, calculate its complement (target - number).
     * - If the complement already exists in the HashSet,
     *   we have found the pair.
     * - Otherwise, add the current number to the HashSet.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     */

    public static void twoSum(int[] nums, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair Found!");
                System.out.println("First Element  : " + complement);
                System.out.println("Second Element : " + num);
                return; // Stop after finding the first pair
            }

            set.add(num);
        }

        System.out.println("No pair found.");
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum(nums, target);
    }
}