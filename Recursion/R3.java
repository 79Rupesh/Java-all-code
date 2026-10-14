// Find the sum of first N natural numbers using recursion.
public class R3 {
    static int sum = 0;

    public static void sumNumber(int n) {
        if (n == 0) {
            return;
        }
        sum = sum + n;
        sumNumber(n - 1);

    }

    public static void main(String[] args) {
        sumNumber(5);

        System.out.println(sum);
    }

}
