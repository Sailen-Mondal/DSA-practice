public class InvertedHalfPyramid {

    public static void printInvertedHalfPyramid(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRotatedInvertedHalfPyramid(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if (j <= (n-i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printInvertedHalfPyramid(n);
        System.out.println("-------");
        printRotatedInvertedHalfPyramid(n);
    }
}
