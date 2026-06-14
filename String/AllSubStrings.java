import java.util.*;

public class AllSubStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        /*
         * substring(startIndex, endIndex)
         *
         * startIndex -> inclusive
         * endIndex   -> exclusive
         *
         * Example:
         * String str = "HELLO";
         * str.substring(0, 3) -> "HEL"
         */

        // Generate all possible non-empty substrings
        for (int i = 0; i < s.length(); i++) {

            // IMPORTANT:
            // j starts from i + 1 because endIndex must be > startIndex
            // j goes up to s.length() because endIndex is exclusive
            for (int j = i + 1; j <= s.length(); j++) {

                System.out.println(s.substring(i, j));
            }
        }

        sc.close();
    }
} 
    

