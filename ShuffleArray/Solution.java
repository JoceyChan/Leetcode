// JAVA program to iterate over an array 
// using for loop 
import java.io.*;
import java.util.Arrays; 
class Solution {
    public static void main(String args[]){

        shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        shuffle(new int[]{1, 2,3,4,4,3,2,1}, 4);
        shuffle(new int[]{1,1,2,2}, 2);

    }
    
    // Time: (Array size) / 2 = m / 2 where m is the size of the array
    // Space: O(m) where m is the size of the array 
    public static int[] shuffle(int[] nums, int n) {   
        // iterating over an array 
        int j = 0;
        int[] pairs = new int[2*n];
        for (int i = 0; i < n; i++) { 
            pairs[j] = nums[i];
            pairs[j+1] = nums[i+n];
            j = j + 2; 
            // accessing each element of array 
           // System.out.println(nums[i]); 
        } 
        // pairs = [2]
        // j = 0, i = 0, n = 3, pairs[0] = nums[0] = 2, pairs[1] = nums[3] = 3, pairs = [2, 3]
        // j = 2, i = 1, n = 3, pairs[2] = nums[1] = 5, pairs[3] = nums[4] = 4, pairs = [2, 3, 5, 4]
        System.out.println(Arrays.toString(pairs));
        return pairs;
    } 
}
