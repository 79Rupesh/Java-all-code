/*
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

public class p5 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
*/
public class p5 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;

        }
    }
}
