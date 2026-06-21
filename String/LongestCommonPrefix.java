import java.util.*;

public class LongestCommonPrefix{

	public String optimalLCP(String[] strs){
		String str = new String();
		Arrays.sort(strs);

		String s1 = strs[0];
		String s2 = strs[strs.length-1];

		int i = 0;
		while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
			str += s1.charAt(i);
			i++;
		}

		return str;
	}

	public String longestCommonPrefix(String[] strs){
		String str = new String();
		
		//Getting the length of the shortest element 
		String s = strs[0];
		int minL = s.length();	//Holds the value
                                                                                                                         
		for(int i = 1; i < strs.length; i++){
			String tempS = strs[i];
			if (tempS.length() < minL)
				minL = tempS.length();
			//System.out.println("Debug: " + tempS.length() + " minL: " + minL);
        }

		//Loops
		outerloop:
		for(int i = 0; i < minL; i++){
			String temp1 = strs[0];
            System.out.println( "Outerloop: " + "i: " + i +"Str: " + str + "temp1 : " + temp1);

			for(int j = 1; j < strs.length; j++){
				temp1 = strs[j];
				String temp2 = strs[j-1];
                System.out.println("j: " + j);
				//compare
				if(temp1.charAt(i) != temp2.charAt(i)){
					break outerloop;
				}
			}
			str += temp1.charAt(i);
			
		}
        			
		return str;
        }

    
	

 	public static void main(String args[]){
	//Scanner sc = new Scanner(System.in);

	String strs[] = {"flowerddd","flow","flightdddddddd"};
	LongestCommonPrefix obj = new LongestCommonPrefix();
	obj.longestCommonPrefix(strs);

	System.out.println(obj.optimalLCP(strs));

    }
}

