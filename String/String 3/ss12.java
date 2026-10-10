// count vowel and consunate in string

public class ss12 {
    public static void main(String[] args) {
        String str = "Rupesh";

        int vowel = 0;
        int consonate = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("auieoAIOUE".indexOf(ch) != -1) {
                vowel++;
            } else {
                consonate++;
            }
        }
        System.out.println("vowel : " + vowel);
        System.out.println("consunate :" + consonate);
    }
}
