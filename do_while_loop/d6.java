// Print multiplication table of N
//  Input: 3 → Output: 3 6 9 ... 30

package do_while_loop;

public class d6 {
    public static void main(String args[]) {
        int n = 6;

        int table = 0;
        int i = 1;

        do {
            table = i * n;
            System.out.println(n + " * " + i + " = " + table);
            i++;
        } while (12 >= i);
    }

}
