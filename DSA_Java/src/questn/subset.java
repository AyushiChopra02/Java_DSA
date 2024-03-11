package questn;

import java.util.Scanner;

public class subset {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int[] nums = new int[N];
	       
	        for (int i = 0; i < N; i++) {
	            nums[i] = scanner.nextInt() ;
	        }
	        
	        int target = scanner.nextInt();

	        System.out.println( target);
	        printSubsets(nums, 0, target, "");
	        System.out.println( countSubsets(nums, 0, target));
	        scanner.close();
	    }
	    public static void printSubsets(int[] nums, int index, int target, String subset) {
	        if (index == nums.length) {
	            if (target == 0) {
	                System.out.print(subset + " ");
	            }
	            return;
	        }
	        // Include current element
	        printSubsets(nums, index + 1, target - nums[index], subset + nums[index] + " ");
	        // Exclude current element
	        printSubsets(nums, index + 1, target, subset);
	    }
	    public static int countSubsets(int[] nums, int index, int target) {
	        if (index == nums.length) {
	            return (target == 0) ? 1 : 0;
	        }
	        // Include current element
	        int include = countSubsets(nums, index + 1, target - nums[index]);
	        // Exclude current element
	        int exclude = countSubsets(nums, index + 1, target);
	        return include + exclude;
	    }
	}

