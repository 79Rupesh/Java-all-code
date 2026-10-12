package NoArgument_NoReturnTyp;

// Prime Numbers 1 to 100

public class NN2 {
    static void prime() {
        int n = -9;

        while (n <= 0) {
            System.out.println("not prime value");
            break;
        }
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;

                }

            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        prime();
    }

}
