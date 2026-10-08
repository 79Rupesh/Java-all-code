// 3. Reverse a number
//  Input: 123 → Output: 321
package do_while_loop;

public class d3 {
    public static void main(String[] args) {
        int num = 12345;
        int n = 0;
        do {
            n = num % 10;
            System.out.print(n + " ");
            num /= 10;

        } while (num > 0);
    }

}
