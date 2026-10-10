// sort and merge two array
public class ss13 {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5 };
        int arr2[] = { 2, 4, 6 };
        int merge[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }

        // sort
        for (int i = 0; i < merge.length; i++) {
            for (int j = i + 1; j < merge.length; j++) {
                if (merge[i] > merge[j]) {
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }

    }
}
