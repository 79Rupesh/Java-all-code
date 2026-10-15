/*
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y

public class p3 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
        
            for (int j = 1; j <= 4; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
    */

public class p3 {
    public static void main(String args[]) {
        int i = 1;
        char ch = 'A';
        while (i <= 5) {

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
