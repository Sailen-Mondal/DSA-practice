import java.util.*;

public class Anagram{

	static boolean areAnagram(String s1, String s2){
        if(s1.length()  != (s2.length()) ){
            return false;
        }
        char sa1[] = new char[s1.length()];
        char sa2[] = new char[s1.length()];
    
        for(int i = 0; i < s1.length(); i++){
            sa1[i] = s1.charAt(i);
            sa2[i] = s2.charAt(i);
        }
        Arrays.sort(sa1);
        Arrays.sort(sa2);

        for(int i = 0; i < s1.length(); i++){
            if(sa1[i] != sa2[i])
                return false;
        }


        return true;
	}	

	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();

        String s1 = "sailen", s2 = "sailne";
        System.out.println(areAnagram(s1,s2));
	}
}