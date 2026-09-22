//  Check if a year is a leap year
import java.util.Scanner;
public class R6 {
    public static void main(String[] args){

        Scanner Rupesh = new Scanner(System.in);
        System.out.print("Enter your year ");
        int year=Rupesh.nextInt();

        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.print("leap year = "+year);
        }
        else{
            System.out.print("not leap year = "+year);
        }
        Rupesh.close();
    }
}
