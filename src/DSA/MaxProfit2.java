package DSA;

import java.util.HashMap;

public class MaxProfit2 {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}

	private static int maxProfit(int[] nums) {

		int profit = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] > nums[i-1]) {
				profit+=nums[i] - nums[i-1]; // profit= profit + nums[i] - nums[i-1];
			}
		}
		return profit;
	}
}
