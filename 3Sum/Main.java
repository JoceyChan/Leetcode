import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        threeSum(new List<>(-1,0,1,2,-1,-4));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> threeSum = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            int j = i + 1; 
            int k = nums.length + 1;
            if(i != j && i != k && j != k){
                System.out.println("no dups");
            }
        }
        return null;
    }
}
