package Searching;

public class BinarySearch
{
    public static void binarySearch(int arr[], int target)
    {
        int low = 0; 
        int high = arr.length-1;


        while(low <= high)
        {
            int mid = (low + high) / 2;
            // Debug print
            System.out.println("low=" + low +
                                ", high=" + high +
                                ", mid=" + mid +
                                ", arr[mid]=" + arr[mid]);

            if (arr[mid] == target)
            {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1, 3, 5, 7, 9, 11, 13};
        int target = 9;
        binarySearch(arr, target);
    }
}