// Reverse Number pattern
// 1
// 2 1
// 3 2 1
// 4 3 2 1
/*
public class p8 {
    public static void main(String[] args) {
        int n = 4;
        int i = 1;
        while (i <= n) {
            int j = i;
            while (j >= 1) {
                System.out.print(j + " ");
                j = j - 1;
            }
            System.out.println();
            i = i + 1;
        }
    }

}
*/

public class p8 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}