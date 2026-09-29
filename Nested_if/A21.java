import java.util.Scanner;

public class A21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("if you are student enter 1 else 0");
        int student = sc.nextInt();

        if (age < 12 && student == 1) {
            System.out.println("free pass");
        } else if (age >= 12 && age < 25 && student == 1) {
            System.out.println("half");

        } else {
            System.out.println("full ");

        }
        sc.close();
    }
}