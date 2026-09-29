
// ATM Machine Simulation
import java.util.Scanner;

public class A10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        System.out.println("1. withdrawal ");
        System.out.println("2.chack Balance ");
        System.out.println("3.Diposit");

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter your withdrawal : ");
            int withdrawal = sc.nextInt();
            if (withdrawal <= 1000) {
                balance = balance - withdrawal;
                System.out.println("withadrawal  successfully : ");
                System.out.println("Remaing balance : " + balance);
            } else {
                System.out.println("withdrawal not successfully");

            }

        } else if (choice == 2) {
            System.out.println("your is balance : " + balance);

        } else if (choice == 3) {
            System.out.println("Enter your diposit : ");
            int diposit = sc.nextInt();
            balance = balance + diposit;
            System.out.println("Diposit successfuly");
            System.out.println("update balance : " + balance);

        } else {
            System.out.println("invalid choice");
        }
        sc.close();
    }

}
