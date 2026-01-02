package Searching;

public class FirstLastOccurrenceBS
{
    public static void firstOccurrence(int arr[], int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int firstOccurrence = -1;   
        
        while(low <= high)
        {   
            mid = (low + high) / 2;
            if(arr[mid] == target)
            {
                firstOccurrence = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        //Pinting first Occurrence (if value is -1 means element not found / present!)
        System.out.println("Frist Occurrence at index: " + firstOccurrence );
    }

    public static void lastOccurrence(int arr[], int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int lastOccurrence = -1;   
        
        while(low <= high)
        {   
            mid = low + (high - low) / 2;
            if(arr[mid] == target)
            {
                lastOccurrence = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        //Pinting last Occurrence (if value is -1 means element not found / present!)
        System.out.println("Last Occurrence at index: " + lastOccurrence );
    }

    public static void main(String args[])
    {
        int arr[] = {1, 2, 4, 4, 4, 6, 7};
        int target = 4;
        firstOccurrence(arr, target);
        lastOccurrence(arr, target);
    }
}
