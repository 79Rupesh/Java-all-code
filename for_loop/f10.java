// Count digits of a numbe
package for_loop;

public class f10 {
    public static void main(String args[]) {
        int n = 23456;
        int count = 0;
        ;
        for (int i = 1; n > 0; i++) {

            count++;
            n = n / 10;

        }
        System.out.println("count : " + count);
    }

}
