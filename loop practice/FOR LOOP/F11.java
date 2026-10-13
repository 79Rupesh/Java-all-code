public class F11 {
    public static void main(String[] args) {
        int n = 789;
        int temp;
        int reverse = 0;
        for (; n > 0;) {
            temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;

        }
        System.out.println(reverse);
    }

}
