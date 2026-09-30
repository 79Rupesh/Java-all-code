//  Ek number input lo aur uske sabhi factors print karo.
package for_loop;

import java.util.Scanner;

public class f14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :  ");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " are :- ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("factor number : " + i);
            }
        }
        sc.close();

    }

}
