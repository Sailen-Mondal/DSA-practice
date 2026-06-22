import java.util.*;

public class ReverseStringUsingRecursion{
    static StringBuilder sb = new StringBuilder();
    public static String revString(String s, int i){

        if(i == s.length()) return "";
   
        revString(s, i+1);

        sb.append(s.charAt(i));
        System.out.println(s.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        revString(str,0);
        System.out.println("sb: " + sb);
        sc.close();
    }
}