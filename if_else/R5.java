//  Check if a number is positive, negative, or zero
import java.util.Scanner;
public class R5 {
    public static void main(String[] args) {
        Scanner Rupesh= new Scanner(System.in);
        System.out.print("Enter your number = ");
        int a=Rupesh.nextInt();
        if(a>0){
            System.out.print("number is positive  = "+a);
        
        }
        else if(a<0){
            System.out.print("number is negetive = "+a);            
        }
        else{
            System.out.print(" number is Zero = "+a);
        }
Rupesh.close();

    }
}
