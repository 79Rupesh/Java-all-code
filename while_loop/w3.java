// Reverse a number

public class w3 {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println(" 1234 number ka reverse value : " + rev);
    }

}
