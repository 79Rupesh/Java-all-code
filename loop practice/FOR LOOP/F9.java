public class F9 {
    public static void main(String[] args) {
        int n = 123;
        int temp = 0;
        int sum = 0;
        for (; n > 0;) {
            temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println(sum);
    }

}
