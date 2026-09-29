// Parking Fee Calculator
public class A19 {
    public static void main(String args[]) {
        int hour = 8;
        if (hour > 2) {
            int parking_charge = (hour - 2) * 20;
            System.out.println("parking charge : " + parking_charge);
        } else {
            System.out.println("parking charge free");
        }
    }

}
