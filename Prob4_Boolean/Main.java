import java.util.ArrayList;
import java.util.List;
public class Main{
    public static List <Boolean> main(int[] candies, int extraCandies){
        kidsWithCandies(new int[]{2,3,5,1,3}, 3);

    } 
    public static List <Boolean> kidsWithCandies(int[] candies, int extraCandies){
       int maxCandies = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
                System.out.println(maxCandies);
            } 
        }
        return true;
    }

}