import java.util.*;

public class SumOfAllSubstringsOfANumber {

    // Returns the sum of all numeric substrings
    public static int sumSubstrings(String s) {

        int sum = 0;

        // Generate all substrings
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                sum += Integer.parseInt(s.substring(i, j));
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = sc.nextLine();

        System.out.println("Sum of all substrings: " + sumSubstrings(s));

        sc.close();
    }
} 
