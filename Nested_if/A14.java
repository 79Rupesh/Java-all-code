// Discount Calculator
public class A14 {
    public static void main(String args[]) {
        int purchase = 5695;
        double decount = 0;
        if (purchase >= 5000) {
            decount = purchase * 0.20;

        } else if (purchase >= 3000) {
            decount = purchase * 0.10;
        } else if (purchase > 1000) {
            decount = purchase * 0.10;

        } else {
            System.out.println("no dicount");
        }
        purchase -= decount;
        System.out.println("discount : " + decount);
        System.out.println("final bill : " + purchase);
    }
}
