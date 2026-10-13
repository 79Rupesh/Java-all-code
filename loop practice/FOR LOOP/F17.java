public class F17 {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int gcg = 0;
        for (int i = 2; (i <= a && i <= b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcg = i;
            }
        }
        System.out.println(gcg);

    }

}
