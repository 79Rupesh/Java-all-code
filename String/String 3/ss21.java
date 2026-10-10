// print the prime number in the range.
public class ss21 {

    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        for (start = 10; start <= end; start++) {
            int count = 0;
            for (int i = 1; i <= start; i++) {

                if (start % i == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    System.out.println("prime number : " + start);
                }

            
        }
    }
}