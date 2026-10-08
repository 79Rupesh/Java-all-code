package do_while_loop;

public class d11 {
    public static void main(String[] args) {
        int a = 15;
        int b = 12;
        int i;

        if (a > b) {
            i = a;
        } else {
            i = b;
        }
        do {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
            i++;
        } while (true);

    }

}
