
import java.util.Scanner;

public class A17 {
    public static void main(String args[]) {
        String Username = "Rupesh";
        String passsword = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username : ");
        String username = sc.nextLine();
        System.out.println("Enter your password : ");
        String login_password = sc.nextLine();

        if (username.equals(Username) && (login_password.equals(passsword))) {
            System.out.println("login successfully ");
        } else {
            System.out.println("not login successfully");
        }
        sc.close();
    }

}
