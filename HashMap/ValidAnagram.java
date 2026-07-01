package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {

    /*
     * Problem:
     * Determine whether two strings are anagrams.
     *
     * Example:
     * Input:
     * s = "anagram"
     * t = "nagaram"
     *
     * Output:
     * true
     *
     * Approach:
     * 1. If lengths are different, return false.
     * 2. Count the frequency of each character in both strings.
     * 3. Compare the two HashMaps.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     * ---------------------------------------------
     */

    public static boolean isAnagram(String s, String t) {

        // Base Case
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        // Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        // Count frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        // Compare both frequency maps
        return sMap.equals(tMap);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String : ");
        String s = sc.nextLine();

        System.out.print("Enter Second String: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println("\nAre they Anagrams? -> " + result);

        sc.close();
    }
}