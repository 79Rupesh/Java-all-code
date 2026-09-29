public class A8 {
    public static void main(String args[]) {
        int age = 108;
        boolean hasId = true;
        if (age > 18) {
            if (hasId == true) {
                System.out.println("Eligible");
            } else {
                System.out.println("bring in card");
            }
        } else {
            System.out.println("not Eligible");
        }
    }

}
