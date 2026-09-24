public class B9 {
    public static void main(String[] args) {

        String str = "Rupesh@123";

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            }
            else if (Character.isLowerCase(ch)) {
                lower++;
            }
            else if (Character.isDigit(ch)) {
                digit++;
            }
            else {
                special++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
        System.out.println("Digits = " + digit);
        System.out.println("Special Characters = " + special);
    }
}