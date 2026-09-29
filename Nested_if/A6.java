public class A6 {
    public static void main(String args[]) {

        int a = 4;
        int b = 4;
        int c = 4;

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}