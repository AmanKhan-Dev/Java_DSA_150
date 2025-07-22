package TCS_NQT;

import java.util.*;

public class Frequency_Sort {
    public static void main(String[] args) {
        int nums[] = {2, 9, 2, 9, 7, 9};

        // Step 1: Count frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert to list and sort by frequency descending
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Step 3: Build result list
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int element = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.add(element);
            }
        }

        // Output the result
        System.out.println(result);
    }
}
