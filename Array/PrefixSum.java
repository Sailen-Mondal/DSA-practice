

public class PrefixSum {

    public static int[] buildPrefix(int[] nums) {
        int[] prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R) {
        return prefix[R + 1] - prefix[L];
    }

    public static void main(String[] args) {

        int nums[] = {2, 4, 5, 7, 1, 3};

        int[] prefix = buildPrefix(nums);

        System.out.println(rangeSum(prefix, 0, 2));
        System.out.println(rangeSum(prefix, 1, 4));
        System.out.println(rangeSum(prefix, 3, 5));
        System.out.println(rangeSum(prefix, 1, 3));
    }
}
