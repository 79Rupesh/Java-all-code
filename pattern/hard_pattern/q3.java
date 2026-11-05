// Pascal Triangle
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
public class q3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("1 ");
                } else if (i == 3 && j == 2) {

                    System.out.print(i - 1 + " ");

                } else if (i == 4 && (j == 2 || j == 3)) {
                    System.out.print(i - 1 + " ");
                } else if (i == 5 && (j == 2 || j == 4)) {
                    System.out.print(i - 1 + " ");
                } else if (i == 5 && j == 3) {
                    System.out.print(i + 1 + " ");
                }
            }
            System.out.println();
        }

    }

}
