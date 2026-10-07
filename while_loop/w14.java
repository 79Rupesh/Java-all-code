public class w14 {
    public static void main(String args[]) {
        int a = 15;
        int b = 12;

        while (a != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("GCD number " + a);
    }
}