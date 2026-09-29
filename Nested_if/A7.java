public class A7 {
    public static void main(String args[]) {
        int pin = 1234;
        int cases = 500;
        int Amount;
        if (pin == 1234) {
            if (cases < 1000) {
                Amount = 1000 - cases;
                System.out.println("Withdrawal successfull and bank Amount: " + Amount);
            } else {
                System.out.println("not withdrawal successfull");

            }
        } else {
            System.out.println("invaild pin");
        }
    }

}
