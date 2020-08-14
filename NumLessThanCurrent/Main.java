import java.util.*;

public class Main {
    
    public static void main(String[] args){
        smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] newArrayList = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] !=  nums[i] && nums[i] > nums[j]){
                    count++;
                }
            }
            newArrayList[i] = count;
            count = 0;
        }
        System.out.println(Arrays.toString(newArrayList));
        return newArrayList;
    }
}