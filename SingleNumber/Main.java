import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // singleNumber(new int[]{2, 2, 1});
        // singleNumber(new int[]{4, 1, 2, 1, 2});
    }
    public static int singleNumber(int[] nums){
        HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer>();//creates HashMap

        for(int i = 0; i < nums.length; i++){
            if(!hashTable.containsKey(nums[i])){ 
                hashTable.put(nums[i], 1);
            }
            else{
                hashTable.put(nums[i], hashTable.get(nums[i])+ 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry :  hashTable.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value == 1){
                return key;
            }
        }
        return -1;
    }
}