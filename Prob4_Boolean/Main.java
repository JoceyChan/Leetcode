import java.util.List;
public class Main{
    public static void main(String args[]){  
        kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
      
    }
    public static List <Boolean> kidsWithCandies(int[] candies, int extraCandies){

        for(int i = 0; i < candies.length; i++){
            System.out.println(candies[i]);
            if(candies[i] < extraCandies){
                System.out.println("false");
            }               
        }
        return false;
    }
}