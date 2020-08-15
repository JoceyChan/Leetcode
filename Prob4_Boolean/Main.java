import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        kidsWithCandies(new int[]{2,3,5,1,3}, 3);

    } 
    public static List <Boolean> kidsWithCandies(int[] candies, int extraCandies){       
        ArrayList<Boolean> output = new ArrayList<Boolean>();
        boolean isGreaterThanTheRest = true;

        for(int i = 0; i < candies.length; i++){
            for(int j = 0; j < candies.length; j++){
                if(candies[i] + extraCandies < candies[j]){
                    isGreaterThanTheRest = false;
                } 
            }
            output.add(isGreaterThanTheRest);
            isGreaterThanTheRest = true;
        } 
        System.out.println(output);
        return output;
    }
}