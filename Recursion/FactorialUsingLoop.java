import java.util.*;

public class FactorialUsingLoop{
	
	public static int returnFactorial(int n){
		int fac = n; //5
		for(int i = 1; i <=n-1; i++){
			fac = fac * (n - i);
		}
	return fac;
	}

	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Factorial: " + returnFactorial(num));
		sc.close();
	}
}
		