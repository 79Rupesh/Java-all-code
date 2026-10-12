package NoArgument_NoReturnTyp;
//Armstrong Numbers 1 to 1000
public class NN3 {
    static void Armstrong() {

        for (int k = 1; k <= 1000; k++) {

            int n = k;
            int temp = n;
            int original = n;
            int digit = 0;
            int sum = 0;

            while (temp > 0) {
                digit++;
                temp = temp / 10;
            }
            for (int i = 1; i <= digit; i++) {

                int num = original % 10;
                int power = 1;

                for (int j = 1; j <= digit; j++) {
                    power = power * num;
                }
                sum = sum + power;
                original = original / 10;
            }
            if (sum == n) {
                System.out.print(k + " ");
            }
        }
    }

    public static void main(String[] args) {
        Armstrong();
    }
}