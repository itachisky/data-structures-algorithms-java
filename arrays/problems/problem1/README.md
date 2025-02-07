# Best Time to Buy and Sell Stock

## Problem Statement
You are given an array `prices` where `prices[i]` is the price of a given stock on the `i-th` day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return `0`.

## Example

### Example 1:
```plaintext
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```

### Example 2:
```plaintext
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done, and the maximum profit = 0.
```

## Constraints
- `1 <= prices.length <= 10^5`
- `0 <= prices[i] <= 10^4`

## Approach
The optimal approach to solve this problem is to use a **single pass** technique:
1. Keep track of the minimum price encountered so far.
2. At each step, calculate the profit if the stock were sold on that day.
3. Update the maximum profit if the current profit is greater than the previous maximum.

### Time Complexity
- **O(n)**: We traverse the array once.

### Space Complexity
- **O(1)**: We use only a few extra variables.

