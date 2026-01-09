package Array;
class ArrayTraversal 
{
    public static void main(String args[])
    {
        int arr[] = {19,39,34,29,54,23};
        // for(int x : arr)
        // {
        //     System.out.println("X :"+ x);
        // }
        int min = arr[0];
        int max = arr[0];
        int temp = 0;
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Array at index " + i + " :" + arr[i]);

            // Finding max
            if(arr[i]>= max)
            {
                max = arr[i];
            }

            // Finding min
            if (arr[i]<= min)
            {
                min = arr[i];
            }

            // Finding Sum of array
            temp += arr[i];
        }
            //printing Min-Max
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            //printing Sum
            System.out.println("Sum of array is: "+ temp);
    }
}