import java.util.*;

public class ModifyString {

    // Converts the entire string based on the case of the first character
    public static String modify(String s) {

        char firstChar = s.charAt(0);

        if (Character.isUpperCase(firstChar)) {
            return s.toUpperCase();
        }

        return s.toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Modified String: " + modify(s));

        sc.close();
    }
}