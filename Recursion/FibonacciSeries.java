package Recursion;

public class FibonacciSeries {

    // Returns the nth Fibonacci number
    public static int printFib(int n) {

        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case
        return printFib(n - 1) + printFib(n - 2);
    }

    public static void main(String[] args) {

        int n = 7;

        // Print Fibonacci series till nth term
        for (int i = 0; i < n; i++) {
            System.out.print(printFib(i) + " ");
        }
    }
}
