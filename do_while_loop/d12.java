// Check whether a number is prime
//  Input: 7 → Output: Prime

package do_while_loop;

class d12 {
    public static void main(String args[]) {
        int num = 12;
        boolean isprime = true;
        int i = 2;
        if (num < 0) {
            isprime = false;

        }
        do {
            if (num % i == 0) {
                isprime = false;
                break;
            }
            i++;
        } while (num > i);
        if (isprime) {
            System.out.println("prime number hai");
        } else {
            System.out.println("not prime number ");
        }
    }

}