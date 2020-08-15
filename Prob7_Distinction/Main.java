import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numJewelsInStones("aA", "aAAbbbb"); //Calling method
        numJewelsInStones("z", "ZZ");
    }
    // Time: O(n^2)
    // Space: O(n) 
    public static int numJewelsInStones(String J, String S) {
     int count = 0;

        for(int i = 0; i < J.length(); i++){ 
            for(int j = 0; j < S.length(); j++){
                if(J.charAt(i) == S.charAt(j)){ //checking if both each index of the strings are equal 
                    count++; // incrementing 
                }
            }
        }
        System.out.println(count); 
        return count;
    }
}