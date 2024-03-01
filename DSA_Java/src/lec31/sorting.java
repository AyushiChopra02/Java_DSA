package lec31;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 50};
        Object arr2;
		int arr2[] = {5, 15, 25, 500};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] <= arr2[idx2]) {
                ans[idx3] = arr1[idx1];
                idx1++;
                idx3++;
            } else {
                ans[idx3] = arr2[idx2];
                idx2++;
                idx3++;
            }
        }
        while (idx1 < arr1.length) {
            ans[idx3] = arr1[idx1];
            idx1++;
            idx3++;
        }

        while (idx2 < arr2.length) {
            ans[idx3] = arr2[idx2];
            idx2++;
            idx3++;
        }
        return ans;
    }
}
