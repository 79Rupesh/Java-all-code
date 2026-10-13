public class F6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for (int i = 1; i < 6; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(a + " ");
        }
    }

}
