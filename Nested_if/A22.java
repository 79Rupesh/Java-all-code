public class A22 {
    public static void main(String args[]) {
        int amount = 2002;
        double tax = amount * 0.05;
        double total = amount + tax;
        if (total > 2000) {
            double discount = total * 0.10;
            total = total - discount;
            System.out.print("total amount " + total);
        } else {
            System.out.print("no discount : " + total);
        }
    }
}