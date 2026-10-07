// Check whether a number is prime📥
//  Input: 7 → 📤 Output: Prime📥 Input: 10 → 📤 Output: Not prime
public class w20 {
    public static void main(String[] args) {
        int num = 13;
        int i = 2;
        boolean isprime = true;
        if (num <= 1) {
            isprime = false;

        }
        while (i < num / 2) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
            i++;
        }
        if (isprime) {
            System.out.println(" isprime number : " + num);
        } else {
            System.out.println("not isprime number : " + num);
        }
    }
}
