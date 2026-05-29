import java.util.*;

public class TwoDArray {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);

		//Taking number of rows and coloums as in put form the user
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter cols: ");
		int cols = sc.nextInt();
		
		int [][] matrix = new int [rows] [cols];
		
		for(int i = 0; i <  rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix [i] [j] = sc.nextInt();  
			}
		}

		for(int i = 0; i <  rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(matrix[i] [j] + " ");  
			}
		System.out.println();
		}
        sc.close();
	}
}