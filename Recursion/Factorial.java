package Recursion;

public class Factorial {

    // Returns factorial of n (n!)
    public static int myFun(int n) {

        // Base case: factorial of 1 is 1
        if (n == 1)
            return 1;

        // Recursive case: n! = n × (n - 1)!
        return n * myFun(n - 1);
    }

    public static void main(String[] args) {

        // Initial call: computes 5!
        System.out.println(myFun(5));
    }
}
