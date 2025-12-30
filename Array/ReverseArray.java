package Array;
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int revArr[] = new int[arr.length];
        int c = 0;

        for(int i = arr.length-1; i >= 0; i--){
            revArr[c] = arr[i];
            c++;
        }
        for (int x : revArr) {
            System.out.println(x);
        }
    }
    
}
