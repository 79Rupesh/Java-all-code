// Calculate x^n (power) using recursion.
public class R5 {
    public static int power(int x, int index) {
        if (index == 0) {
            return 1;
        }
        int result = x * power(x, index - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(3, 3));
    }

}
