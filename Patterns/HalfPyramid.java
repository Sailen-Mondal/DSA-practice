public class HalfPyramid {

    public static void printHalfPyramid(int height)
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHalfPyramid(5);
    }
}
