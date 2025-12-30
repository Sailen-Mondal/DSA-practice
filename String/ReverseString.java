package String;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Sailen Mondal";
        String revName = new String(); 

        for(int i = name.length()-1; i >= 0 ; i--)
        {
            revName = revName + name.charAt(i);     //Space complixity is fucked!(New mememory for each iteration)
        }
        System.out.println(revName);
    }
}
