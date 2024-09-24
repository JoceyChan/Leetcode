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
        // isAnagram("anagram", "nagaram");
        // isAnagram("rat", "car");
        // isAnagram("ab", "a");

        //Optimized Vz
        isAnagramOptimized("anagram", "nagaram");
        isAnagramOptimized("rat", "cat");
    }
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            System.out.println("false");
            return false;
        }

        char[] str1 = s.toCharArray(); // space: creating arrays of size n therefore O(n)
        char[] str2 = t.toCharArray(); // time: this is O(n) time, since we don't know the length of the string it takes n length

        Arrays.sort(str1); // time: sorting takes O(nlogn)
        Arrays.sort(str2); // space: not extra space needed 

        for(int i = 0; i < str1.length; i++){ //O(n)
            for(int j = 0; j < str2.length; j++){ //O(n)
                if(str1[i] != str2[j]){
                    System.out.println("false");
                    return false;
                }
                i++; // time: this statement skips iterations, therefore not running O(n^2)
            }
        }
        System.out.println("true");
        return true;
    }

    public static boolean isAnagramOptimized(String s, String t){

        return true;
    }

}

/*  Brute Force:
        Time Complexity: O(nlogn) 
            O(n) + O(n) + O(nlogn) + O(nlogn) + O(n) + O(n) 
            O(n) + O(nlogn)
            O(nlogn)
        Space Complexity: O(n)
                O(n) + O(n) 
                O(n)
 */