package arrays.problems.problem2;

public class Solution1 {
    public static void maxSum(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum += arr[end];
                maxSum = Integer.max(currentSum, maxSum);
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] input1 = { 7, 5, -1, 4, -8 };
        maxSum(input1);
    }
}
