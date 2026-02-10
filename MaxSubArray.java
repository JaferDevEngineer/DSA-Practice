package DSA;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArray {
	

	private int maxSubArray(int[] nums) {
		int maxSum = nums[0]; // stores the global maximum sum
		int currentSum = nums[0]; // stores the local maximum sum ending at current index

		for (int i = 1; i < nums.length; i++) {
			// extend current subarray or start new subarray at i
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}

	private int maxSubArrayV2(int[] nums) { // 5,4,-1,7,8
		System.out.println(nums.length);
		int max = nums[0], currentMax = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			System.out.println("index "+ i +" value "+nums[i]);
			currentMax = Math.max(nums[i], currentMax + nums[i]);
			max = Math.max(max, currentMax);
		}
		return max;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		System.out.println(new MaxSubArray().maxSubArrayV2(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(new MaxSubArray().maxSubArrayV3(new int[] {5,4,-1,7,8}));
	}
	private int maxSubArrayV3(int[] nums) {//-2,1,-3,4,-1,2,1,-5,4
		int value = nums[0];
		for(int num = 1;nums.length - 1; i++) {
			value = Math.max(nums[i], value + nums[i]);
		}
	}
}
