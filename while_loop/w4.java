//  Count digits in a number

public class w4 {
    public static void main(String[] args) {
        int num = 344334;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("number is count : " + count);
    }

}
