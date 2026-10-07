// Check if number is palindrome.
public class w5 {
    public static void main(String[] args) {
        int palingrome = 121;
        int original = palingrome;
        int rev = 0;
        while (palingrome > 0) {
            rev = rev * 10 + (palingrome % 10);
            palingrome = palingrome / 10;

        }

        if (original == rev) {
            System.out.println("paligrom number : ");
        } else {
            System.out.println("not palilgram number");
        }
    }

}
