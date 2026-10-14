// Find the maximum element in an array using recursion.
public class R7 {
    static int max = 0;

    public static int sumdigit(int arr[], int index) {

        if (index == arr.length) {
            return 0;
        }
        if (arr[index] > sumdigit(arr, index + 1)) {
            max = arr[index];
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 8, 6, 5, 9 };
        System.out.println(sumdigit(arr, 0));
    }

}
