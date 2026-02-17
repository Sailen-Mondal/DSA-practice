package Array;
import java.util.Arrays;

public class TwoSum {

            //Two sum (Bruteforce)

    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1}; // fallback
    }

    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
