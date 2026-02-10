package DSA;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubArrayLengthOfK {
	public static void main(String[] args) { //[1,5,4,2,9,9,9], k = 3
		System.out.println(solution(new int[] {1,5,4,2,9,9,9},3));
	}

	private static long solution(int[] nums, int k) {
		
		Set<Integer> set = new HashSet<>();
		int left = 0,sum = 0;
		long maxSum = 0;
		
		for(int right = 0;right<nums.length; right++) {
			
			while(set.contains(nums[right])) {
				set.remove(nums[left]);
				sum -=nums[left];
				left++;
			}
			set.add(nums[right]);	
			sum+=nums[right];
			
			
			if(right - left + 1 == k) {
				maxSum = Math.max(maxSum, sum);
				set.remove(nums[left]);
				sum-=nums[left];
				left++;
			}
		}
		return maxSum;
		
	}
	
	
}
