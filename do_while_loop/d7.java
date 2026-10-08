//  Print even numbers between 1 and N
//  Input: 10 → Output: 2 4 6 8 10
package do_while_loop;

public class d7 {
    public static void main(String[] args) {
        int n = 32;
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println("Even number = " + i);
            }
            i++;

        } while (n >= i);
    }

}
