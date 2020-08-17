public class Main {
    public static void main(String[] args){
        maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
    public static int maxSubArray(int[] nums) { 
        // int max = Integer.MIN_VALUE;
        int max = 0;
        int currentMaxSum = 0;
        // System.out.println(Integer.MIN_VALUE);

        for(int i = 0; i < nums.length; i++){
            currentMaxSum += nums[i];
            if (currentMaxSum < 0){
                currentMaxSum = 0;
            }
            else if(max < currentMaxSum){
                max = currentMaxSum;
            }
        }
    System.out.println(max);
    return max;
    }
}