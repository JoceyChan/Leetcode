import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }
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