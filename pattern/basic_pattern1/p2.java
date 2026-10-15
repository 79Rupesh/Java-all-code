/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E

public class p2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            char ch = 'A';
            for (int j = 1; j <= 4; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
*/

public class p2 {
    public static void main(String args[]) {
        int i = 1;

        while (i <= 5) {
            char ch = 'A';
            int j = 1;
            while (j <= 5) {
                System.out.print(ch + " ");
                ch++;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;

        }

    }
}
