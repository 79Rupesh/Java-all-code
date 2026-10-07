// Find power of a number (a^b)📥
//  Input: 2, 5 → 📤 Output: 32

public class w16 {
    public static void main(String args[]) {
        int a = 2;
        int b = 5;
        int power = 1;
        int i = 1;
        while (i <= b) {
            power = power * a;
            i++;
        }
        System.out.println(power);
    }

}
