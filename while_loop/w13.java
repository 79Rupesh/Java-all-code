public class w13 {
    public static void main(String args[]) {
        int num = 153;
        int n = num;
        int sum = 0;
        int j = 0;
        while (n > 0) {
            j = n % 10;
            sum = sum + (j * j * j);
            n = n / 10;
        }
        if (sum == num) {
            System.out.println("Armstong number : " + num);
        } else {
            System.out.println("not Armstong number : " + num);
        }
    }

}
