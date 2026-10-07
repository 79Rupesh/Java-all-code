//  Find LCM of two numbers📥
//  Input: 4, 5 → 📤 Output: 20

public class w18 {
    public static void main(String args[]) {
        int a = 4;
        int b = 5;
        int i;
        if (a > b) {
            i = a;
        } else {
            i = b;
        }
        while (true) {
            if (i % a == 0 && i % b == 0) {
                System.out.println(" LCM : " + i);
                break;

            }
            i++;
        }

    }
}