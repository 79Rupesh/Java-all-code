// E
// DE
// CDE
// BCDE
// ABCDE

public class R4 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + (n - i));
            for (int j = 1; j <= i; j++) {
                char ch2 = (char) (ch + j - 1);

                System.out.print(ch2);

            }
            System.out.println();
        }
            
        }

    }
