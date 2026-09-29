//  Salary Bonus System
public class A11 {
    public static void main(String args[]) {
        double salary = 52000;
        double bonus = 0;
        if (salary >= 50000) {
            bonus = salary * 0.20;
        } else if (salary > 30000) {
            bonus = salary * 0.10;

        } else {
            bonus = salary * 0.10;

        }
        System.out.println("your is bonus : " + bonus);
        System.out.print("total salary : " + (salary + bonus));
    }

}
