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
    
    //Print i to n using two parameters
    public void twoParam(int i, int n){
        if(i == n+1) return;

        System.out.println(i);

        twoParam(i+1, n);
    }

    //Print in decreasing and increasing order
    public void inOrder(int n){
        if(n == 0) return;
        System.out.println(n);
        inOrder(n-1);
        //backtrack
        System.out.println("bt: " + n);
    }

    //Factorial
    public int fact(int n){
        if (n == 1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		RecursionDemo obj = new RecursionDemo();

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();

		//printNToOne(n);
		//obj.printOneToN(i);
        //obj.twoParam(i, n);
        //obj.inOrder(n);
        System.out.println("Factorial: " + obj.fact(n));
        sc.close();;
	}
}