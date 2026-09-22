import java.util.Scanner;

public class R15 {

    // 🔹 Function: number reverse karne ke liye
    public static int reverseNumber(int num) {
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;   // last digit nikala
            rev = rev * 10 + digit; // reverse me add kiya
            num = num / 10;         // last digit hata diya
        }

        return rev;
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Reverse
        int rev = reverseNumber(num);

        // Step 3: Difference
        int diff = num - rev;

        // Step 4: Output
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + rev);
        System.out.println("Difference: " + diff);

        sc.close();
    }
}