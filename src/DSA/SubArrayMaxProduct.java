package DSA;

public class SubArrayMaxProduct {
	public static void main(String[] args) {
		int[] nums = 
//			{2,3,-2,4};
			{-2,0,-1};
		int ans = solution(nums);
		System.out.println(ans);
	}

	private static int solution(int[] nums) {
		int pre = 1,suf = 1,max = Integer.MIN_VALUE,length = nums.length;
		
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println("pre "+nums[i]+" suf "+nums[length - i - 1]);
			if(pre == 0) pre =1;
			if(suf == 0) suf = 1; 
			pre*=nums[i];
			suf*=nums[length - i - 1];
			System.out.println("pre "+pre+" suf "+suf);
			max = Math.max(max, Math.max(pre, suf));
		}
		
		return max;
	}
}
