import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){
        removeDuplicates(new int[]{1, 1, 2});
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});

    }
    public static int removeDuplicates(int[] nums) {
        int n = 0; 
        int count = 0;
            
        if (nums.length == 0) {
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[n] != nums[i]){
                n++;
                nums[n] = nums[i];
            }
        }
        for(int i = 0; i <= n; i++){
            count++;
        }
        
        System.out.println(count);
        return count;
    }
}

