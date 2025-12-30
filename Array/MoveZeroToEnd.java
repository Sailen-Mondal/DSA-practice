package Array;
public class MoveZeroToEnd {
    public static void main(String args[])
    {
        int arr[] = {0, 1, 0, 3, 12};
        int tempArr[] = new int[arr.length];
        //Declaring pointers
        int ptr = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                tempArr[ptr] = arr[i];
                ptr++;
            }
        }
        for(int x : tempArr)
        {
            System.out.println(x);
        }
    }
}
