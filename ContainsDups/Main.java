import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        containsDuplicate(new int[]{1, 2, 3, 1});
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
            if(nums[i] == nums[i+1]){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}
