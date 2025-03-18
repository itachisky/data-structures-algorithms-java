package arrays.problems.problem4;

import java.util.Arrays;

public class Solution1 {
    public static int twoSum(int[] arr) {
        Arrays.sort(arr);
        int freq = 1;
        int ans = arr[0];

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                freq++;
            } else {
                freq = 1;
                ans = arr[i+1];
            }

            if(freq > arr.length/2) {
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = { 3,2,3 };
        int result1 = twoSum(input1);
        System.out.println(result1);

        int[] input2 = { 2,2,1,1,1,2,2 };
        int result2 = twoSum(input2);
        System.out.println(result2);
    }
}
