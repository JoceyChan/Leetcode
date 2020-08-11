import java.util.List;
public class Main{
    public static List <Boolean> main(int[] candies, int extraCandies){
       
    } 
    public static List <Boolean> kidsWithCandies(int[] candies){
        int maxCandies = 0;
        for(int i = 0; i < candies.length; i++){
            System.out.println(candies[i]);
            if(candies[i] < maxCandies){
                candies[i] = maxCandies;
            }               
        }
    }

}