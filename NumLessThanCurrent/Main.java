public class Main {
    
    public static void main(String[] args){
        smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[]{};
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        return nums;
    }
}