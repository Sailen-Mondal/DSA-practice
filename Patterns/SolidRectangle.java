public class SolidRectangle {

    static void printRectangle(int height, int width)
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printRectangle(5,10);
    }
}
