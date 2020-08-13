import java.util.*;

// Time: O(n) if the loop variables is incremented / decremented by a constant amount
// Space: O(n) where n is the number given by the user
public class Main {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int mod;
        int product = 1;
        int sum = 0;
        int result = 0;

        while (n > 0){
            mod = (n % 10); // mod is = to the division of n by 10 and gets the remainder 
            product = product * mod;
            sum = sum + mod;
            n = n/10; // n is being reassigned, n is being divided by 10 and then goes back to the while loop
            // System.out.println(mod); //prints the remainder of mod
            result = product - sum;
        }
        return result;
    }
}