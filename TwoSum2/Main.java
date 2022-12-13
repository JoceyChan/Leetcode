import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        twoSum(new int[]{1, 2, 3, 4}, 9);
    }
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            map.put(numbers[i], i);
        }
        for(int i = 0; i < numbers.length; i++){
            int comp = target - numbers[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                int[] res = new int[]{i + 1, map.get(comp) + 1};
                return res;
            }
        }
        return null;
    }
}
