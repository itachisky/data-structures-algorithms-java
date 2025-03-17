package arrays.problems.problem2;

public class Solution2 {
    public static int maxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            currentSum += arr[start];
            maxSum = Integer.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] input1 = { -2,1,-3,4,-1,2,1,-5,4 };
        int result = maxSum(input1);
        System.out.println(result);
    }
}
