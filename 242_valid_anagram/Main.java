/*  Given two strings s and t, return true if t is an anagram of s, and false otherwise
        Ex 1: 
            input: s = "anagram" t = "nagaram" 
            output: true
        Ex 2: 
            input: s = "rat" t = "car" 
            output: false
*/
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        isAnagram("anagram", "nagaram");
        isAnagram("rat", "car");
        isAnagram("ab", "a");
    }
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            System.out.println("false");
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i = 0; i < str1.length; i++){
            for(int j = 0; j < str2.length; j++){
                if(str1[i] != str2[j]){
                    System.out.println("false");
                    return false;
                }
                i++;
            }
        }
        System.out.println("true");
        return true;
    }
}
