package Sorting;

public class BubbleSort
{
    //Bubble Sort with early-exit optimization
    public static void bubbleSort(int nums[])
    {

    for(int i = 0; i < nums.length - 1; i++)
    {
        boolean swapped = false;    //tracks if any swaps happens in this pass

        for(int j = 0; j < nums.length - i - 1; j++)
        {
            //Debug: Prints current indices
            System.out.println("for i: " + i + " || " + "for j: " + j);

            if(nums[j] > nums[j+1])
            {
            //Debug: Swap details
            System.out.println("Swapping <-> " + "Element: " + nums[j] + " and " + nums[j+1]);

            //Swap adjacent elements
            int temp;
            temp = nums[j];
            nums[j] = nums[j+1];
            nums[j+1] = temp;

            swapped = true;
            }
        }

        //Optimization (Breaks the loop if the array is already sorted)
        if(!swapped)
            break;
    }
        // Printing Sorted Array
        System.out.println("---Array after being Sorted---");
        for (int x : nums) 
        {
            System.out.println(x);
        }
    }
    

    public static void main(String args[])
    {
        int nums[] = {5, 1, 4, 2, 8};  
        bubbleSort(nums);
    }
}