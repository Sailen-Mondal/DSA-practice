import java.util.*;

public class MostFrequentChar {

    // Method 1: Brute Force - O(n²)
    public char frequencyOfChar1(String s) {

        char maxChar = s.charAt(0);
        int maxFreq = 0;

        // Check frequency of every character
        for (int i = 0; i < s.length(); i++) {

            int freq = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    freq++;
                }
            }

            // Update maximum frequency
            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = s.charAt(i);
            }
        }

        return maxChar;
    }

    // Method 2: Sort + Two Pointers - O(n log n)
    public char frequencyOfChar2(String s) {

        char[] ch = s.toCharArray();
        Arrays.sort(ch); // Same characters become adjacent

        char maxChar = ch[0];
        int maxFreq = 0;

        int i = 0;
        int j = 0;

        while (i < ch.length) {

            // Find the end of current character group
            while (j < ch.length && ch[i] == ch[j]) {
                j++;
            }

            int currentFreq = j - i;

            // Update maximum frequency
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxChar = ch[i];
            }

            // Move to next group
            i = j;
        }

        return maxChar;
    }

    //Method 3: Frequency Array (Best)
    public char frequencyArray(String s){
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i);
            int ctr = ch - 97;
            arr[ctr] ++;
        }

        int max = arr[0];
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];

            if(temp > max){
                max = temp;
                index = i;
            }
                
        }

        return (char)(index + 97);
    }


    public static void main(String[] args) {

        MostFrequentChar obj = new MostFrequentChar();

        String str = "output";

        System.out.println("Brute Force     : " + obj.frequencyOfChar1(str));
        System.out.println("Sort + Pointers : " + obj.frequencyOfChar2(str));
        System.out.println(obj.frequencyArray(str));
        //System.out.println('a' + 1);
    }
}