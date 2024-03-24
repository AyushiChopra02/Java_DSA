package lec36;

import java.util.Stack;

public class largest_histgrm {
	
	    public int largestRectangleArea(int[] heights) {
	        int n = heights.length;
	        int[] leftBound = new int[n];
	        int[] rightBound = new int[n];
	        Stack<Integer> stack = new Stack<>();
	        for (int i = 0; i < n; i++) {
	            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
	                stack.pop();
	            }
	            leftBound[i] = stack.isEmpty() ? -1 : stack.peek();
	            stack.push(i);
	        }
	        stack.clear(); 
	        // Find right bounds
	        for (int i = n - 1; i >= 0; i--) {
	            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
	                stack.pop();
	            }
	            rightBound[i] = stack.isEmpty() ? n : stack.peek();
	            stack.push(i);
	        }
	        int maxArea = 0;
	        for (int i = 0; i < n; i++) {
	            int area = heights[i] * (rightBound[i] - leftBound[i] - 1);
	            maxArea = Math.max(maxArea, area);
	        }
	        return maxArea;
	    }
	
}
