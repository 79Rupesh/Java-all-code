// Count the number of digits in a number using recursion.
public class R6 {
    public static int digitnumber(int n) {

        if (n == 0) {
            return 0;
        }
        int number = 1 + digitnumber(n / 10);
        return number;

    }

    public static void main(String[] args) {
        System.out.println(digitnumber(1234656));
    }

}