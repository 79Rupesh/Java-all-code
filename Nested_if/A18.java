public class A18 {
    public static void main(String args[]) {
        int Age = 32;
        int salary = 8737483;
        int creadit_score = 889;
        if (Age >= 21) {
            if (salary >= 25000) {
                if (creadit_score >= 700) {
                    System.out.println(" Bank Loan Approved ");
                } else {
                    System.out.println(" not Bank Loan Eligibility");
                }
            } else {
                System.out.println("not creadit score not found ");
            }
        } else {
            System.out.println("not eligibility age");
        }
    }

}
