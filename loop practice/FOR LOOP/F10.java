public class F10 {
    public static void main(String[] args) {
        int n = 45567;
        int count = 0;
        for (; n > 0;) {
            count++;
            n = n / 10;
        }
        System.out.println(count);

    }
}
