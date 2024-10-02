import java.util.Arrays;
import java.util.HashMap;
/* 
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, 
and you may not use the same element twice.
You can return the answer in any order. 

    Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]

    Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]
*/
public class Main {
    public static void main(String args[]){
        int[] nums = {2, 7, 11, 15};
        // twoSum(nums, 9);
        optTwoSum(nums, 9);
    }

    // Brute Force:
    public static int[] twoSum(int[] nums, int target){
        int[] indices = new int[2];
        for(int i = 0; i  < nums.length; i++){ 
            for(int j = i + 1; j < nums.length; j++){ 
                int sum = nums[i] + nums[j];
                if(sum == target && i != j){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        for(int i = 0; i < indices.length; i++){
            System.out.println(indices[i]);
        }
        return indices;
    }

    // Optimized
    public static int[] optTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i]; 
            map.put(nums[i], i);
            if(map.containsKey(comp)){
                indices[0] = map.get(comp);
                indices[1] = i;
            }
        }
        for(int i = 0; i < indices.length; i++){
            System.out.println(indices[i]);
        }
        return indices;
    }
}
/* 
    Brute Force Time & Space Complexity:
        Time Complexity: O(n^2)
        Space Complexity: O(1)

    Optimized Time & Space Complexity:
        Time Complexity: O(n)
        Space Complexity: O(n)

 */
