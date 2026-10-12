// find the factorial of n .
public class AR3 {
    static int factorial(int n) {
        int sum=1;
        for (int i = 1; i <= n; i++) {
            sum =sum*i;
        }
        return sum;

    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

}
