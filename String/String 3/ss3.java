// Best Time to Buy and Sell Stock — LeetCode 121
// Array me har element ek din ka stock price hai.
// Example: [7, 1, 5, 3, 6, 4]
// Tumhe:

// ek din buy
// uske baad kisi din sell
// karna hai.

// Goal:

// Maximum profit find karo.
// Important condition
// Tum pehle sell karke baad me buy nahi kar sakte.
// Buy → Sell hona chahiye.
// Dry Run

// Array: [7, 1, 5, 3, 6, 4]

// Hum do cheeze maintain karenge:

// Ab tak ka minimum price
// Ab tak ka maximum profit
// Day	Price	Minimum Price	Profit
// 1	7	7	0
// 2	1	1	0
// 3	5	1	4
// 4	3	1	4
// 5	6	1	5
// 6	4	1	5
// Samjho

// Price 7

// Abhi tak minimum = 7

// Profit = 0

// Price 1

// 1 < 7

// To minimum price update:

// minimum = 1

// Price 5

// Agar 1 par buy kiya aur 5 par sell kiya:

// 5 - 1 = 4

// Profit = 4

// Price 3

// 3 - 1 = 2

// Purana profit 4 bada hai.

// So profit = 4

// Price 6

// 6 - 1 = 5

// Profit = 5

// Price 4

// 4 - 1 = 3

// Profit still 5.

// Final answer

// Maximum profit = 5

// Buy at 1, sell at 6.

// Pattern

// Ye Minimum So Far + Maximum Profit pattern hai.

// Complexity
// Time: O(n)
// Space: O(1)

public class ss3 {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price = 0; price < arr.length; price++) {
            minPrice = Math.min(minPrice, price);

            // Aaj sell karne par kitna profit hoga
            int profit = price - minPrice;

            // Maximum profit update karo
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);
    }
}