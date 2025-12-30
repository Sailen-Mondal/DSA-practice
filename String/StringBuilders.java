package String;

public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A B C D E");
        System.out.println(sb);

        int j = sb.length()-1;

        for(int i = 0; i<sb.length()/2;i++)
        {
            char front = sb.charAt(i);
            char back = sb.charAt(j);
            
            sb.setCharAt(i, back);
            sb.setCharAt(j,front) ;
            j--;
            System.out.println(sb);
        }

    }
}