//  Find the greatest of three numbers

import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        Scanner Rupesh = new Scanner(System.in);
        System.out.print("Enter your frist number = ");
        int a = Rupesh.nextInt();
        System.out.print("Enter your second number = ");
        int b = Rupesh.nextInt();
        System.out.print("Enter your third number = ");
        int c = Rupesh.nextInt();
        if (a > b && a > c) {
            System.out.print(" a is grether = " + a);
        } else if (b > a && b > c) {
            System.out.print("b is grether than =" + b);
        } else {
            System.out.print("c is grether than = " + c);
        }
        Rupesh.close();
    }

}
