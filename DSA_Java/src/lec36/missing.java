package lec36;
import java.util.Stack;

public class missing {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            if (num > 0) {
                stack.push(num);
            }
        }
        int smallestMissing = 1;
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current == smallestMissing) {
                smallestMissing++;
            } else if (!stack.isEmpty() && current - stack.peek() > 1) {
                
                return smallestMissing;
            }
        }
        return smallestMissing;
    }
    public static void main(String[] args) {
        missing solution = new missing();

        int[] nums1 = {1, 2, 0};
        int missing1 = solution.firstMissingPositive(nums1);
        System.out.println("Smallest missing positive in nums1: " + missing1); 

        int[] nums2 = {3, 4, -1, 1};
        int missing2 = solution.firstMissingPositive(nums2);
        System.out.println("Smallest missing positive in nums2: " + missing2); 

        int[] nums3 = {7, 8, 9, 11, 12};
        int missing3 = solution.firstMissingPositive(nums3);
        System.out.println("Smallest missing positive in nums3: " + missing3); 
    }
}
