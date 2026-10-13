public class a3 {
    public static void main(String[] args) {
        int n = 1234;
        int temp = 0;
        int reverse = 0;
        while (n > 0) {
            temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;
        }
        System.out.println(reverse);
    }

}
