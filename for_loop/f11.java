//  Reverse a number
package for_loop;

public class f11 {
    public static void main(String arg[]) {
        int num = 345;
        int n = 0;
        for (int i = 0; num > 0; i++) {
            n = num % 10;
            System.out.print(n + " ");
            num = num / 10;

        }

    }

}
