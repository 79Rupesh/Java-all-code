public class a6 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int i = 1;

        while (i > 0) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                return;

            }
            i++;

        }

    }

}
