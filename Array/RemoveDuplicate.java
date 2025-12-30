package Array;

public class RemoveDuplicate
{
    public static void main(String args[])
    {
        // Input:  [1, 1, 2, 2, 3,4]
        // Output: k = 3
        // Array:  [1, 2, 3, _, _]
        int arr[] = {1,1,2,2,3};
        
        int i=0;
        int j=1;

        for(j =1;j<arr.length;j++)  
        {
            if(arr[i] != arr[j])
            {
                i++;
                arr[i] =  arr[j];
            }

        }

        for(int x : arr)
        {
            //printing new array without duplicate
            System.out.println(x);

        }

    }
}