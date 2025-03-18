package arrays.problems.problem4;

import java.util.Arrays;

public class Solution2 {
    public static int majorityElement(int[] arr) {
        int freq = 0;
        int ans = 0;

        for(int i=0; i<arr.length; i++) {
            if (freq == 0) {
                ans = arr[i];
            }

            if (ans == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = { 3,2,3 };
        int result1 = majorityElement(input1);
        System.out.println(result1);

        int[] input2 = { 2,2,1,1,1,2,2 };
        int result2 = majorityElement(input2);
        System.out.println(result2);

        int[] input3 = { 3,3,4 };
        int result3 = majorityElement(input3);
        System.out.println(result3);
    }
}
