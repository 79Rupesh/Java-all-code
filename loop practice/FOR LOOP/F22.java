public class F22 {
    public static void main(String[] args) {

        int num = 122345;
        int[] count = new int[10];

        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num = num / 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " = " + count[i]);
        }
    }
}