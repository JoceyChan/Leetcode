import java.util.HashMap;
public class Optimized {
    public static void main(String[] args){
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        return null;
    }
}