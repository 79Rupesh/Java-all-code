/*

// n ke man ka squre banana
4 4 4 4
4 4 4 4
4 4 4 4
4 4 4 4

public class p4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

}
*/

public class p4 {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}

