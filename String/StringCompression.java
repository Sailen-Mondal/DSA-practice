import java.util.*;

public class StringCompression {

    // Compress consecutive characters
    public static int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        for (int j = 1; j <= chars.length; j++) {

            // End of current character group
            if (j == chars.length || chars[j] != chars[i]) {

                sb.append(chars[i]);

                int count = j - i;

                // Add count only if frequency > 1
                if (count > 1) {
                    sb.append(count);
                }

                i = j;
            }
        }

        // Copy compressed result back to array
        for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }

        return sb.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        int newLength = compress(chars);

        System.out.println("Compressed Length: " + newLength);

        System.out.print("Compressed String: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }

        sc.close();
    }
}