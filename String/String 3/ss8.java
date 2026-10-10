// check for palindrom in string

public class ss8 {
    public static void main(String[] args) {
        String str = "madam";

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }

}
