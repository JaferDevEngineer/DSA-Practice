package DSA;

import java.util.Arrays;

public class Rob {

	public static void main(String[] args) {
		System.out.println(new Rob().rob(new int[] { 2, 1, 1, 2 })); // 2,1,1,2
//		System.out.println(5%2);
	}

//	public int rob(int[] nums) {
//
//		int n = nums.length;
//		if (n == 0)
//			return 0;
//		if (n == 1)
//			return nums[0];
//
//		int[] dp = new int[n];
//		dp[0] = nums[0];
//		dp[1] = Math.max(nums[0], nums[1]);
//		System.out.println(Arrays.toString(dp));
//		for (int i = 2; i < n; i++) {
//			dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
//			System.out.println(dp[i]);
//		}
//		System.out.println(Arrays.toString(dp));
//		return dp[n - 1];
//	}

	private int rob(int[] nums) {
		int size = nums.length;
		if (size == 0)
			return 0;
		if(size==1)
			return nums[0];
		
		int[] dp = new int[size];
		
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
									  // 2,2,0,0 
		for(int i = 2; i<size; i++) { // 2,1,1,2
			dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
		}
		
		return dp[size-1];
	}

	private int rob2(int[] nums) { // 2, 1, 1, 2 
		int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) { // p1 = 2,p2 = 2
            int curr = Math.max(prev1, nums[i] + prev2); //cur =3
            
            prev2 = prev1; //p1=p2 == 2=2
            prev1 = curr;  // p1 = cur = 3 
        }

        return prev1;
    
	}
}
