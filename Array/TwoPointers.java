package Array;

public class TwoPointers {
    public static void main(String[] args) {

        // Sorted array + target sum
        int[] arr = {1, 3, 4, 6, 8, 10};
        int target = 14;

        // Two pointers: start (smallest) and end (largest)
        int i = 0;
        int j = arr.length - 1;

        // Remembers whether a valid pair is found
        boolean found = false;

        // Continue until pointers cross
        while (i < j) {

            int sum = arr[i] + arr[j];

            if (sum < target) {
                // Need a bigger sum → move left pointer forward
                i++;
            } 
            else if (sum > target) {
                // Need a smaller sum → move right pointer backward
                j--;
            } 
            else {
                // Exact match found
                System.out.println("Pair exists: " + arr[i] + " & " + arr[j]);
                found = true;
                break;
            }
        }

        // Loop finished without finding any valid pair
        if (!found) {
            System.out.println("Pair not found");
        }
    }
}
