package Arrays;

import java.util.*;

public class TopFrequentElements {
    static int[] kElements(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap =
                new PriorityQueue<>((a, b) -> a.getValue().compareTo(b.getValue()));

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] topKElements = new int[k];
        for (int i = 0; i < k; i++) {
            topKElements[i] = heap.poll().getKey();
        }

        return topKElements;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int k = 1;
        int[] result = kElements(arr, k);
        for (int x : result)
            System.out.print(x + " ");
    }
}
