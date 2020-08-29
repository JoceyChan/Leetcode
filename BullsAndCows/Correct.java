import java.util.HashMap;

public class Correct {
    public static void main(String[] args){
        getHint("1807", "7810");
    }
    public static String getHint(String secret, String guess){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int bulls = 0; 
        int cows = 0;

        for(int i = 0; i < secret.length(); ++i){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }
            else{
                if(map.getOrDefault(secret.charAt(i), 0) < 0) {
                    cows++; 
                }
                if(map.getOrDefault(guess.charAt(i), 0) > 0){            
                    cows++;
                }
                System.out.println(cows);
                // System.out.println(guess.charAt(i));

                map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
                map.put(guess.charAt(i), map.getOrDefault(guess.charAt(i), 0) - 1);

            }
        }
        System.out.println(Integer.toString(bulls) + "A" + Integer.toString(cows) + "B");
        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
    }
}