//  Print Fibonacci series (N terms)📥
//  Input: 5 → 📤 Output: 0 1 1 2 3

public class w15 {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int i = 1;
        int n = 5;
        int c = 0;
        while (i <= n) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }

}
