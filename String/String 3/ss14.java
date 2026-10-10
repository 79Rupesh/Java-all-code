public class ss14 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 5, 4, 8 };
        int ch = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ch < arr[i]) {
                ch = arr[i];
            }
        }
        System.out.println("Largest value : "+ch);
    }

}
