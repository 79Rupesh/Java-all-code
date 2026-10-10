// find the second largest element.

public class ss22 {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 20, 8, 15 };
        int largest = arr[0];
        int secondlargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {           
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }

        }
        System.out.println("largest = " + largest);
        System.out.println("secondlargest = " + secondlargest);

    }

}
