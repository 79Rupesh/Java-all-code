/*
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4

public class p6 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
*/

public class p6 {
    public static void main(String args[]) {
        int i = 1;
        int n = 4;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}