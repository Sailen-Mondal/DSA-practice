package String;

public class PalindromeCheck {

    public static void main(String[] args) {

        /*
         * Problem:
         * Check whether a given string is a palindrome.
         * Rules:
         * - Ignore spaces, symbols, punctuation
         * - Compare characters in a case-insensitive way
         * - Do NOT modify the string
         * - Use efficient logic (O(n))
         */

        String str = "A man, a plan, a canal: Panama";

        // Left pointer: starts from beginning of the string
        int i = 0;

        // Right pointer: starts from end of the string
        int j = str.length() - 1;

        /*
         * Flag to remember the result.
         * We ASSUME the string is a palindrome.
         * If we find even ONE mismatch, we flip this to false.
         */
        boolean isPalindrome = true;

        /*
         * Loop until the two pointers cross.
         * Everything outside [i, j] has already been checked or ignored.
         */
        while (i < j) {

            /*
             * Step 1: If left character is NOT a letter or digit,
             * it does not matter for palindrome checking.
             * So skip it by moving left pointer forward.
             */
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }

            /*
             * Step 2: If right character is NOT a letter or digit,
             * skip it by moving right pointer backward.
             */
            else if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }

            /*
             * Step 3: Now both characters are valid (letter or digit),
             * so we can safely compare them.
             */
            else {
                // Convert both characters to lowercase for case-insensitive comparison
                char leftChar  = Character.toLowerCase(str.charAt(i));
                char rightChar = Character.toLowerCase(str.charAt(j));

                /*
                 * If characters do not match,
                 * the string is NOT a palindrome.
                 * We set the flag and stop further checking.
                 */
                if (leftChar != rightChar) {
                    isPalindrome = false;
                    break; // No need to continue
                }

                /*
                 * If characters match:
                 * - move left pointer forward
                 * - move right pointer backward
                 * Continue checking inner characters.
                 */
                i++;
                j--;
            }
        }

        /*
         * Final decision based on the flag.
         * We do NOT rely on pointer positions,
         * only on whether a mismatch was found.
         */
        if (isPalindrome) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
