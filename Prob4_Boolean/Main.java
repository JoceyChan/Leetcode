import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        kidsWithCandies(new int[]{2,3,5,1,3}, 3);

    } 
    public static List <Boolean> kidsWithCandies(int[] candies, int extraCandies){
       int maxCandies = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxCandies){
                candies[i] = maxCandies;
                System.out.println(maxCandies);
            } 
        }
        return true;
    }

}