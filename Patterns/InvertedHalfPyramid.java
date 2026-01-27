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
    public static void main(String[] args) {
        printInvertedHalfPyramid(4);
    }
}
