import java.util.*;

public class RecursionDemo{
	//print n to 1
	public static void printNToOne(int n){
		//base case
		if (n == 0) return;
		
		//work
		System.out.println("Method->printNToOne: " + n);

		//call
		printNToOne(n-1);

	}

	//Print i to n using global variable
	static int n = 10;

	public void printOneToN(int i){
		//base case
		if(i == n+1) return;
		System.out.println("Method->printOneToN: " + i);
		printOneToN(i+1);
	}
		
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		RecursionDemo obj = new RecursionDemo();

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();



		printNToOne(n);
		obj.printOneToN(i);
	}
}