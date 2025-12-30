package Recursion;

public class SumOfNNum {

    // Returns sum of numbers from 1 to n
    public static int myFun(int n) {

        // Base case: sum of 0 is 0
        if (n == 0)
            return 0;

        // Recursive case: n + sum of (n - 1)
        return n + myFun(n - 1);
    }

    public static void main(String[] args) {

        // Prints sum from 1 to 5
        System.out.println(myFun(5));
    }
}
