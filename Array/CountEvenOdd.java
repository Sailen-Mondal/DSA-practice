package Array;
public class CountEvenOdd {
    public static void main(String args[])
    {
        int arr[] = {12, 7, 9, 4, 18, 21};
        int evenCounter = 0;
        int oddCounter = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] %2 == 0)
            {
                evenCounter++;
            }
            if(arr[i] %2 != 0)
            {
                oddCounter++;
            }
        }
        System.out.println("Even count: " + evenCounter);
        System.out.println("Odd count: " + oddCounter);
    }
}
