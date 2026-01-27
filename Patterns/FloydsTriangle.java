public class FloydsTriangle {

    public static void printFloydsTriangle(int n)
    {
        int temp = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printFloydsTriangle(n);
    }
}
