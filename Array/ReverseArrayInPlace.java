package Array;
public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 35, 40, 50};

        //Initilizing pointers
        int i = 0;
        int j = arr.length-1;

        //Swapping
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x : arr)
        System.out.println(x);
    }
    
}
