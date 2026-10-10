// . Merge Sorted Array
// Do sorted arrays diye hain.

// Example: nums1 = [1,2,3,0,0,0]
// nums2 = [2,5,6]

// nums1 ke last 3 spaces khaali hain.
// Final result:
// [1,2,2,3,5,6]
// Important idea
// Dono arrays sorted hain.
// Hum last se comparison karenge.

// Kyun?
// Kyuki nums1 ke beginning ke elements already present hain aur last me empty spaces hain.
// Dry Run
// Initial:
// nums1 = [1,2,3,0,0,0]

// nums2 = [2,5,6]
// Pointers:
// i → nums1 ka last actual element = 3
// j → nums2 ka last = 6
// k → nums1 ka last position
// Step 1
// Compare:
// 3 vs 6
// Bada = 6
// Last position par 6.
// [1,2,3,0,0,6]
// Step 2
// Compare:
// 3 vs 6
// Bada = 5
// [1,2,3,0,5,6]
// Step 3
// Compare:
// 3 vs 2
// Bada = 3
// [1,2,3,3,5,6]
// Step 4
// Ab nums1 ka current element 2
// nums2 ka current 2
// Kisi ek ko place karenge:
// [1,2,2,3,5,6]
// Remaining 1,2 automatically correct position me aa jaate hain.
// Pattern
// Two pointers from the end

// Complexity
// Time: O(m+n)
// Space: O(1)

import java.util.Arrays;

public class ss4 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int arr2[] = { 2, 5, 6 };
        int n = 3;

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        System.out.println("Merged Array: " + Arrays.toString(arr1));
    }
}
