// reverse number
public class ss17 {
    public static void main(String[] args) {
        int num = 12345;
        int result = 0;

        while (num > 0) {
            int n = num % 10;
            result = result * 10 + n;
            num = num / 10;
        }

        System.out.println(result);
    }

}
