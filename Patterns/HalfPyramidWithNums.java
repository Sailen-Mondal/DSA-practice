public class HalfPyramidWithNums {

    public static void printHalfPyramidWithNums(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printInvertedHalfPyramidWithNums(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j <= (n-i); j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        printHalfPyramidWithNums(n);
        printInvertedHalfPyramidWithNums(n);
    }
}
