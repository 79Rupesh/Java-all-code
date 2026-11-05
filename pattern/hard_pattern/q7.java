/*

Heart pattern
 **   **
**** ****
*********
 *******
  *****
   ***
    *

*/
public class q7 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i == 1 && (j == 1 || j == 4))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 4; j++) {
                if ((i == 1 && (j == 1 || j == 4))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}