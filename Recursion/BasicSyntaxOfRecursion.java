package Recursion;

public class BasicSyntaxOfRecursion {

    // This function calls itself with increasing value of n
    public static void funCallItself(int n) {

        // Base case: stops recursion when n reaches 11
        if (n == 11)
            return;

        // Work BEFORE recursive call (forward direction)
        System.out.println(n);

        // Recursive call with next value
        funCallItself(n + 1);

        // Work AFTER recursive call (backtracking phase)
        System.out.println(n);
    }

    public static void main(String[] args) {

        // Initial call starts recursion
        int n = 1;
        funCallItself(n);
    }
}
