public class Main {
    public static void main(String[] args){

    }
    public static String getHint(String secret, String guess){
        for(int i = 0; i < secret.length(); i++){
            for(int j = 0; j < guess.length(); j++){
                if(secret.charAt(i) == guess.charAt(j)){
                    System.out.println("equal");
                }
            }
        }
    }
}