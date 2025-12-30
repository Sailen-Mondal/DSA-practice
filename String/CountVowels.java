package String;

public class CountVowels {
    public static void main(String[] args) {
        String name = "SailenMondal";
        int vowel = 0;

        for(int i=0; i<name.length(); i++)
        {
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U')
            {
                vowel++;
            }
        }
        System.out.println("The total vowel count is:" + vowel);
        

    }
    
}