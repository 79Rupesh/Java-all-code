/*
  *   *
 * * * *
*   *   *
 */

public class q6 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 9; j++) {
                if (i == 1 && (j == 1 || j == 5)) {
                    System.out.print("*");
                } else if (i == 2 && (j == 1 || j == 3 || j == 5 || j == 7)) {
                    System.out.print("*");
                } else if (i == 3 && (j == 1 || j == 5 || j == 9)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}