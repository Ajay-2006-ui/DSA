package DSA;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int k = 2;

        // Stores: prefixSum -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once before the array starts
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            // Add current element to running prefix sum
            prefixSum += arr[i];

            // Required previous prefix sum
            int need = prefixSum - k;

            // If the required prefix sum exists,
            // add its frequency to the answer
            if (map.containsKey(need)) {
                count += map.get(need);
            }

            // Increase frequency of current prefix sum
            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Number of subarrays = " + count);
    }
}
