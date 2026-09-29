public class A4 {
    public static void main(String args[]) {
        String a = "Rupesh@123";
        if (a.length() > 8) {
            if (a.contains("@")) {
                System.out.print("Valid password : " + a);
            } else {
                System.out.println("not cotains : " + a);
            }
        } else {
            System.out.println("not valid password : " + a);
        }

    }
}