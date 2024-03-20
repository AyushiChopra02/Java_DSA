package questn;

import java.util.Stack;

public class patrn_132 {
    public boolean find132pattern(int[] nums) {
	        if (nums == null || nums.length < 3){
	            return false;
	        }
	        int n = nums.length;
	        int[] minLeft = new int[n];
	        minLeft[0] = nums[0];
	        for (int i = 1; i < n; i++) {
	            minLeft[i] = Math.min(minLeft[i - 1], nums[i]);
	        }
	        Stack<Integer> stack = new Stack<>();
	        for (int j = n - 1; j >= 0; j--) {
	            if (nums[j] > minLeft[j]) {
	                while (!stack.isEmpty() && stack.peek() <= minLeft[j]) {
	                    stack.pop(); 
	                }
	                if (!stack.isEmpty() && stack.peek() < nums[j]) {
	                    return true;  
	                }
	                stack.push(nums[j]); 
	            }
	        }
	        return false; 
	    }
	    public static void main(String[] args) {
	        patrn_132 solution = new patrn_132();

	        int[] nums1 = {1, 2, 3, 4};
	        System.out.println(solution.find132pattern(nums1)); 
	        int[] nums2 = {3, 1, 4, 2};
	        System.out.println(solution.find132pattern(nums2)); 

	        int[] nums3 = {-1, 3, 2, 0};
	        System.out.println(solution.find132pattern(nums3)); 
	    }
	

}

