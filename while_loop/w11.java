// Product of digits
public class w11 {
    public static void main(String args[]) {
        int num = 12345;
        int digit = 1;
        int product = 1;
        while (num > 0) {
            digit = num % 10;
            product = product * digit;
            num = num / 10;

        }
        System.out.println("product of number : " + product);
    }

}
