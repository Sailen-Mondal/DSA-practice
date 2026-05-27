import java.util.*;

public class Test{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch = sc.next().charAt(0);		//Taking ch as input
		System.out.println(ch);

		switch(ch){
			case 'a' : System.out.println("Sailen Mondal");
			break;
			
			case 'b' : System.out.println("Arko Mondal");
			break;

			default: System.out.println("Invalid Input!");
		}
		sc.close();
	}
}