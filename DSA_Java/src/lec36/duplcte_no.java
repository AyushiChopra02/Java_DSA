package lec36;

import java.util.Scanner;

public class duplicate_no {
    public static class Solution {
        public int findDuplicate(int[] nums) {
            int n = nums.length;
            int[] count = new int[n];  // ek count array bnate h, jisme hum numbers ki frequency store karenge.

            // Phir hum nums array ke har element ki frequency count array mein badha dete hain. Har ek number ke liye uski frequency ko count array mein ek index pe store karte hain.
            for (int num : nums) {
                count[num - 1]++;
            }

            // Fir hum count array mein se check karte hain ki koi number jiski frequency 1 se zyada hai, yani ki duplicate hai. Us number ko return kar dete hain.
            for (int i = 0; i < n; i++) {
                if (count[i] > 1) {
                    return i + 1;  // Return the number with frequency greater than 1
                }
            }

            return -1;  // If no duplicate is found
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Solution solution = new Solution();

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        // Input the elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the findDuplicate method
        int result = solution.findDuplicate(nums);

        // Output the result
        if (result != -1) {
            System.out.println("Duplicate number with frequency > 1: " + result);
        } else {
            System.out.println("No duplicate found.");
        }

        scanner.close();
    }
}
