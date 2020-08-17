public class Main {
    public static void main(String[] args){
        maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
    public static int maxSubArray(int[] nums) { 
        int max = Integer.MIN_VALUE;
        int currentMaxSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            currentMaxSum += nums[i];
            if(max < currentMaxSum){
                max = currentMaxSum;
            }
            if (currentMaxSum < 0){
                currentMaxSum = 0;
            }
        }
    System.out.println(max);
    return max;
    }
}