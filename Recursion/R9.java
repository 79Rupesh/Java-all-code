//  find the n fibonacci serice in using recurtion .

public class R9 {

    public static int fiboncci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fiboncci(n - 1) + fiboncci(n - 2);
    }

    public static void main(String args[]) {

        System.out.println(fiboncci(6));

    }
}
