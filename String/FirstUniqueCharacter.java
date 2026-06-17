import java.util.*;

public class FirstUniqueCharacter {

    // Returns the index of the first non-repeating character
    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int index = ch - 'a';

            freq[index]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int index = ch - 'a';

            if (freq[index] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (lowercase only): ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("First Unique Character Index: " + result);

        sc.close();
    }
}