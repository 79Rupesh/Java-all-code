//  Find greatest of three numbers
public class A2 {
    public static void main(String[] args) {
        int a = 18;
        if (a % 3 == 0) {
            if (a % 9 == 0) {
                System.out.println("divisible by 3 and 9");
            } else {
                System.out.println("divible by 3 but not 9");
            }
        } else {
            System.out.println("nout  divible by 3 and 9");
        }

    }

}
