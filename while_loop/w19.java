//  Print sum of even numbers from 1 to N📥
//  Input: 10 → 📤 Output: 30

public class w19 {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(" Print sum of even numbers from 1 to 10 : " + sum);
    }

}
