// Sum of digits of a number
//  Input: 456 → Output: 15
package do_while_loop;

import java.util.Scanner;

public class d8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int sum = 0;
        int n = 0;
        do {
            n = num % 10;
            sum = sum + n;
            num = num / 10;

        } while (num > 0);
        System.out.println("sum = " + sum);
        sc.close();
    }

}
