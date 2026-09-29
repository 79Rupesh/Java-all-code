// Income Tax Calculator
public class A12 {

  public static void main(String args[]) {
    double incom = 6000000;
    double tax = 0;
    if (incom <= 250000) {
      System.out.println("no tax");
    } else if (incom >= 25000 && incom <= 500000) {
      tax = (250000 * 0.05);

    } else if (incom >= 500000 && incom <= 1000000) {
      tax = (250000 * 0.05) + (incom - 500000) * 20;
    } else {
      tax = (250000 * 0.05) + (500000 * 0.10) + (incom - 1000000) * 0.30;
    }
    System.out.println(tax);

  }

}
