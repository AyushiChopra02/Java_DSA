package lec47;

import java.util.HashMap;

public class hm_ques {
    public static void main(String[] args) {
        int arr[] = {15, 23, 4, 3, 2};
        int target = 9;
        int[] result = sum(arr, target);
        if (result != null) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid indices found.");
        }
    }

    public static int[] sum(int[] arr, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = t - arr[i];
            if (map.containsKey(complement)) {
                // Found the pair
                return new int[] {map.get(complement), i};
            }
            // Store current element and its index in the map
            map.put(arr[i], i);
        }

        // No valid pair found
        return null;
    }
}
