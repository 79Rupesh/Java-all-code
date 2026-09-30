package for_loop;

public class f9 {
    public static void main(String args[]) {
        int num = 123;
        int sum = 0;
        int digit = 0;
        for (int i = 0; num > 0; i++) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;

        }
        System.out.println("sum of number : " + sum);
    }

}
