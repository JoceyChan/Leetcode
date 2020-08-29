import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        getHint("1807", "7810");
    }
    public static String getHint(String secret, String guess){
        HashMap<Character, Integer> A = new HashMap<Character, Integer>();
        HashMap<Character, Integer> B = new HashMap<Character, Integer>();

        int count = 0;
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){ 
                count++;
            }
            else if(A.containsKey(secret.charAt(i))){
                int temp = A.get(secret.charAt(i));
                temp++; // incrementing the freq by one 
                A.put(secret.charAt(i), temp); // updating the hashmap A
            }
            else if(!A.containsKey(secret.charAt(i))){
                A.put(secret.charAt(i), 1);
            }
            else if(B.containsKey(guess.charAt(i))){
                int temp = B.get(guess.charAt(i));
                temp++; // incrementing the freq by one 
                B.put(guess.charAt(i), temp); // updating the hashmap B
            }
            else if(!B.containsKey(guess.charAt(i))){
                B.put(guess.charAt(i), 1);
            }
        }
        // System.out.println(A);
        // System.out.println(B);
        return secret;
    }
}