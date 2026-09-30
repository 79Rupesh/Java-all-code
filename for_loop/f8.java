//  Check if a number is prime
package for_loop;

public class f8 {
    public static void main(String[] args) {
        int num = 13;
        int i = 2;
        boolean isprime = true;
        if (num <= 1) {
            isprime = false;
        }
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }

            i++;
        }
        if (isprime) {
            System.out.println("number is prime : " + num);
        } else {
            System.out.println("not is prime : " + num);
        }

    }
}