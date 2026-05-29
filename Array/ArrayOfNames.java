import java.util.*;

public class ArrayOfNames {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		sc.nextLine();

		String names[] = new String[size];
		
		for(int i = 0; i < names.length; i++){
			System.out.print("Enter the " + i + " name: ");
			names[i] = sc.nextLine();
		}

		for(String name : names){
			System.out.println(name);
		}
        sc.close();
	}
}