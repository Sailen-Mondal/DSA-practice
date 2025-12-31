package Searching;
import java.util.Scanner;

public class LinearSearch {

    // Returns index of first occurrence, or -1 if not found
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // first occurrence → stop immediately
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element is not present in the array!");
        }

        sc.close();
    }
}
