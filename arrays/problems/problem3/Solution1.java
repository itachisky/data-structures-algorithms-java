package arrays.problems.problem3;

import java.util.Arrays;

public class Solution1 {
    public static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;

        while(start < end) {
            sum = arr[start] + arr[end];

            if(sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                return new int[]{start+1, end+1};
            }
        }

        return new int[]{start+1, end+1};
    }

    public static void main(String[] args) {
        int[] input1 = { 2,7,11,15 };
        int target1 = 9;
        int[] result1 = twoSum(input1, target1);
        System.out.println(Arrays.toString(result1));

        int[] input2 = { 2,3,4 };
        int target2 = 6;
        int[] result2 = twoSum(input2, target2);
        System.out.println(Arrays.toString(result2));

        int[] input3 = { 3,3 };
        int target3 = 6;
        int[] result3 = twoSum(input3, target3);
        System.out.println(Arrays.toString(result3));

        int[] input4 = { -1, 0 };
        int target4 = -1;
        int[] result4 = twoSum(input4, target4);
        System.out.println(Arrays.toString(result4));
    }
}
