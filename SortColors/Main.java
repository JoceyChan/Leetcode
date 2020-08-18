public class Main {
    public static void main(String[] args){
        sortColors(new int[] {2,0,2,1,1,0});
    }
    public static void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; i++){
                if(nums[i] < nums[j]){
                    System.out.println(nums[i]);
                }
            }
        }
    }
}