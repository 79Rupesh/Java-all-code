public class R10 {
    public static void main(String args[]) {

        int num = 121;

        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        int rev = last * 100 + middle * 10 + first;

        if(num == rev){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome number");
        }

    }
}