

public class ReverseString {
    public String revString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        return str;
    }

    public static void main(String[] args) {
        String name = "Sailen Mondal";
        String revName = new String(); 

        for(int i = name.length()-1; i >= 0 ; i--)
        {
            revName = revName + name.charAt(i);     //Space complixity is fucked!(New memory for each iteration)
        }
        System.out.println(revName);
        ReverseString obj = new ReverseString();
        name = obj.revString(name);    //Better Approach!
        System.out.println(name);
    }
}
