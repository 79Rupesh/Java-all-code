// Electricity Bill Calculator
public class A15 {
    public static void main(String args[]) {
        int unit = 354;
        int bill = 0;
        if (unit < 100) {
            bill = unit * 5;
        } else if (unit <= 200) {
            bill = (100 * 5) + (unit - 100) * 7;
        } else if (unit > 200) {
            bill = (100 * 5) + (100 * 7) + (unit - 200) * 10;

        } else {
            System.out.println("koi unit nhi hai");
        }
        System.out.println("bill : " + bill);
    }

}
