import java.util.*;
public class Main {
    public static void main(String[] args) {
        subtractProductAndSum(234);
    }
    public static int subtractProductAndSum(int n) {
        int mod = 0;

        while (n > 0){
            mod = n % 10; // mod is = to the division of n by 10 and gets the remainder 
            n = n/10; // n is being reassigned, n is being divided by 10 and then goes back to the while loop
            System.out.println(mod); //prints the remainder of mod
        }
        return mod;
    }
}