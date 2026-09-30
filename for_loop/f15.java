package for_loop;

import java.util.Scanner;

public class f15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :  ");
        int num = sc.nextInt();
        System.out.print("Factors of " + num + " are sum :- ");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;

            }
        }
        System.out.println("factor number : " + sum);
        
        sc.close();

    }

}
