public class a4 {
    public static void main(String[] args) {
        int n = 121;
        int k = n;
        int temp = 0;
        int reverse = 0;
        while (n > 0) {
            temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;

        }
        if (k == reverse) {
            System.out.println("palindrom number");
        } else {
            System.out.println("not palindrom number");
        }
    }

}
