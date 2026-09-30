package for_loop;

import java.util.Scanner;

public class f2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number : " + i);
            } else {
                System.out.println("Odd niumber : " + i);
            }
            sc.close();
        }

    }

}
