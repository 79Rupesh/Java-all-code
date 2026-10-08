//  2. Sum of first N natural numbers
//  Input: 5 → Output: 15

package do_while_loop;

public class d2 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        int sum = 0;
        do {
            sum = sum + i;
            i++;

        } while (n >= i);
        System.out.print(sum);

    }
}
