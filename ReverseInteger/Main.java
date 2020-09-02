public class Main {
    public static void main(String[] args){
        reverse(123);
    }
    public static int reverse(int x){
        int reverse = 0; 
        while(x != 0 )  // x = 123 
        { // reverse = 123 % 10
            int result =  x % 10; 
            x = x / 10; 
            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE / 10 && result > 7){
            return 0;
        }
         else if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE / 10 && result < -8){
             return 0;
        } 
        reverse = reverse * 10 + result;
        }
        return reverse; 
    }
}