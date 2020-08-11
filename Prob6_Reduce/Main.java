import java.util.Scanner;
import javax.print.attribute.standard.NumberOfDocuments;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int n = 0;

        while( num != 0 ){
            if( num % 2 == 0){
                num = num / 2;
                n += 1;
            }
                else {
                    num = num - 1;
                    n += 1;                
                }
                
            }
    System.out.println(n); 
    scan.close();
        } 
    

 }