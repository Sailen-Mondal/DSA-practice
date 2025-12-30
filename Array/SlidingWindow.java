package Array;

public class SlidingWindow {
    public static void main(String[] args) 
    {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int sum = 0;
        int trackArr[] = new int[arr.length];

        //Getting the sum of first window
        for(int i=0; i<k; i++)
        {
            sum = sum + arr[i];
        }
        trackArr[0] = sum;
        //System.out.println(sum);

        //Sliding window
        int newSum = sum;
        int j = k;

        for(int i=1; i<=(arr.length-k);i++)
        {
            int left = arr[i-1];
            int right = arr[j];
            j++;
            newSum = newSum + right - left;

            //to track the window with highest sum
            trackArr[i] = newSum;
        }
        //Printing the sum of maximum subarray
        int max = trackArr[0];
        for(int i=1; i<trackArr.length; i++)
        {
            if(trackArr[i] > max)
            {
                max = trackArr[i];
            }
        }
        System.out.println("Maimum Sum of the Subarray is: " + max);
    }
}
