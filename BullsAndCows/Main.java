public class Main {
    public static void main(String[] args){
        getHint("1807", "7810");
    }
    public static String getHint(String secret, String guess){
        int count = 0;
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){ 
                // System.out.println(secret.charAt(i) + "equal" + guess.charAt(i));
                System.out.println("A");
                count++;
            }
            else if(secret.charAt(i) != guess.charAt(i)){
                System.out.println("B");
            }
        }
        return secret;
    }
}