// 1. Two Sum
// Hume ek array diya hai aur ek target. Hume do alag elements find karne hain jinka sum target ke equal ho.

// Example:

// nums = [2, 7, 11, 15]
// target = 9

// Hume 2 + 7 = 9 mil gaya.

// Answer indices honge:

// [0, 1]

// Main idea

// Har element ke liye socho:

// "Mere target tak pahunchne ke liye mujhe kitni value chahiye?"

// Agar current value 2 hai aur target 9 hai:

// 9 - 2 = 7

// Ab check karo ki 7 pehle mila hai ya nahi.

// Dry Run
// i	Current	Need = 9-current	Pehle mila?	Action
// 0	2	7	❌	2 ko store
// 1	7	2	✅	Answer [0,1]
// Step-by-step

// Initially:

// Map = {}

// i = 0

// Current = 2

// Need:

// 9 - 2 = 7

// Map me 7 nahi hai.

// So 2 ko index ke saath store:

// {2 → 0}

// i = 1

// Current = 7

// Need:

// 9 - 7 = 2

// Map me 2 already hai.

// 2 index 0 par tha.

// Current 7 index 1 par hai.

// Therefore:

// Answer = [0,1]

// Pattern

// Ye question tumhe HashMap + Complement pattern sikhata hai.

// Complexity
// Time: O(n)
// Space: O(n)

public class ss2 {
    public static void main(String[] args) {
        int arr[] = { 2, 70, 7, 22, 43 };
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print(i);
                }
            }
        }
    }
}
