// chexk for anagram
public class ss19 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;

        }
        for (int i = 0; i < str1.length(); i++) {

            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    count1++;
                }

                if (str1.charAt(i) == str2.charAt(j)) {
                    count2++;
                }
            }
            if (count1 != count2) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }
    }

}
