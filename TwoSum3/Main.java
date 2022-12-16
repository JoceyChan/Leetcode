import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        TwoSum(new int[]{1, 2, 3, 4}, 9);

    }
    class TwoSum {
        private HashMap<Integer, Integer> nums;
   
       public TwoSum() {
           this.nums = new HashMap<Integer, Integer>(); //basic constructor
       }
       
       public void add(int number) {
           if(this.nums.containsKey(number)){ //if the number is in hashmap then increment count else add number to map
               this.nums.replace(number, this.nums.get(number)+1);
           }
           else{
               this.nums.put(number, 1); // if not there then put the number in 1
           }
       }
       
       public boolean find(int value) {
           for(Map.Entry<Integer, Integer> entry : this.nums.entrySet()){ // Storing both the key and value together
               int comp = value - entry.getKey(); // getting key because key = number
               if(comp != entry.getKey()){
                   if(this.nums.containsKey(comp)){
                       return true;
                   }
               }
               else {
                   if(entry.getValue() > 1){ // the values are set to 1 if there is not a duplicate of the value
                       return true; 
                   }
               }
           }
           return false;
       }
   }
    
}
