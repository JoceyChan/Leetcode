import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        decompressRLElist(new int[]{1, 2, 3, 4});
        decompressRLElist(new int[]{1,1,2,3});
    }
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length/2; i++){
                int freq = nums[2 * i];
                int val = nums[2 * i + 1];
            for(int j = 0; j < freq; j++){
                output.add(val);
            } 
        }
        int[] ret = new int[output.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = output.get(i).intValue();
        }
        System.out.println(Arrays.toString(ret) + "\n");
        return ret;
    }
}

// j = 0, freq=1, val=2, currentIndex = 0; output[0] = [2]
// j = 0, freq=3, val=4, currentIndex = 1; output[1] = [2, 4]
// j = 1, freq=3, val=4, currentIndex = 2; output[2] = [2, 4, 4]
// j = 2, freq=3, val=4, currentIndex = 3; output[3] = [2, 4, 4, 4]