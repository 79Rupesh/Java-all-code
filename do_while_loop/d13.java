package do_while_loop;

public class d13 {
    public static void main(String[] args) {
        String input = "Rupesh";
        int index = 0;
        int count = 0;
        if (input.length() > 0) {
            do {
                char ch = input.charAt(index);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
                index++; // Agle character par jaane ke liye

            } while (index < input.length()); // Jab tak string khatam nahi hoti

        }

        System.out.println("Input: \"" + input + "\" → Output: " + count);
    }
}
