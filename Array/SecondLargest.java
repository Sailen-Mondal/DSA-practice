package Array;
public class SecondLargest {
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 40, 77, 30, 25 , 77};
        int largest = arr[0];
        int secondLargest = arr[1];

        // Comparing in case of the initialization was wrong
        if(arr[1] > arr[0])
        {
            largest = arr[1];
            secondLargest = arr[0];
        }

        // Loop starts form index 2 as index 0 & 1 have already compared
        for(int i = 2; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                // If largest found, current largest becomes Second largest first then update the largest
                secondLargest = largest;
                largest = arr[i];
            }
            // in case There is a element which is samaller than largest but bigger than Second largest
            else if (arr[i] > secondLargest && arr[i] < largest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
