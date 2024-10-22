/* 217. Contains Duplicate
    * Easy
    * Given an integer array nums, return true if any value appeards at least twice in the array, 
    * and return false if evey element is distinct
    * 
    *  Example 1: 
    * 
    *          Input: nums = [1, 2, 3, 1]
    *          Output: true
    * 
    *  Example 2: 
    * 
    *          Input: nums[1, 2, 3, 4]
    *          Output: false
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3, 1};
        containsDuplicateBF(nums);
    }

    // Brute Force
    public static boolean containsDuplicateBF(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}

/*
    Brute Force:
        Time Complexity: O(nlogn)
        Space Complexity: O(n)
 */