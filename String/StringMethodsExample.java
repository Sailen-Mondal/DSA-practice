import java.util.*;

public class StringMethodsExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Sample string for demonstration
        String s = "Sailen Mondal";

        // Returns total number of characters (including spaces)
        System.out.println("Length                : " + s.length());

        // Returns index of first occurrence of 'a'
        System.out.println("First Index of 'a'    : " + s.indexOf('a'));

        // Returns index of last occurrence of 'a'
        System.out.println("Last Index of 'a'     : " + s.lastIndexOf('a'));

        // Returns character at given index
        System.out.println("Character at Index 3  : " + s.charAt(3));

        // Converts string to lowercase
        System.out.println("Lowercase             : " + s.toLowerCase());

        // Converts string to uppercase
        System.out.println("Uppercase             : " + s.toUpperCase());

        // Checks whether a substring exists
        System.out.println("Contains \"ailen\"      : " + s.contains("ailen"));

        // Checks whether string starts with given prefix
        System.out.println("Starts With \"S\"       : " + s.startsWith("S"));

        // Lexicographical comparison
        // 0  -> equal
        // +ve -> s > str
        // -ve -> s < str
        System.out.println("compareTo() Result    : " + s.compareTo(str));

        // Concatenates two strings
        System.out.println("Using concat()        : " + s.concat(str));

        // Concatenation using + operator
        System.out.println("Using + Operator      : " + (s + str));

        sc.close();
    }
}