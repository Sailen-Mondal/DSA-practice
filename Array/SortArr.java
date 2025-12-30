package Array;
public class SortArr {
    public static void main(String[] args) {
        int arr[] = {84,22,53,54,99,10};

        int i = 0;
        int j = 1;

        for(int l=0; l<5; l++) //To counter Worst case
        {
            for(int k = 1; k < arr.length; k++)
            {
                if(arr[i] > arr[j])
                {   
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
                j++;
            }
            i = 0;
            j = 1;
        }

        //Printing Sorted array
        for(int x : arr)
        {
            System.out.println(x);
        }
    }
}
