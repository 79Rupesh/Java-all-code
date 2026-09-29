public class A5 {
    public static void main(String args[]) {
        int year = 2400;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year : " + year);
                } else {
                    System.out.println("not leap year : " + year);
                }
            } else {
                System.out.println("leap year : " + year);
            }
        } else {
            System.out.println("not leap year:" + year);
        }
    }

}
