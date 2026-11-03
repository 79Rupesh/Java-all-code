// Check whether a number is a palindrome using recursion.
public class R10 {

    public static boolean palindrome(int n, int rev, int original) {

        if (n == 0) {
            return rev == original;
        }

        int a = n % 10;
        rev = rev * 10 + a;
        n = n / 10;

        return palindrome(n, rev, original);
    }

    public static void main(String[] args) {
        System.out.println(palindrome(121, 0, 121));
    }
}


