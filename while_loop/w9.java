//  Count even and odd digits
public class w9 {
    public static void main(String[] args) {
        int number = 787;
        int num;
        int even = 0, odd = 0;
        while (number > 0) {
            num = number % 10;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number = number / 10;

        }
        System.out.println("Even number : " + even);
        System.out.println(" Odd number : " + odd);

    }
}
