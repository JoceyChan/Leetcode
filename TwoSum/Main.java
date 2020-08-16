import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && j != i){
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }    
        return new int[]{-1, -1};
    }
}