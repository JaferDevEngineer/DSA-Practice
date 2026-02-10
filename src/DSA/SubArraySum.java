package DSA;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
	public static void main(String[] args) {
		System.out.println(subarraySum(new int[] { 1, 1, 1 }, 2)); // 2
		System.out.println(subarraySum(new int[] { 1, 2, 3 }, 3)); // 2
		System.out.println(subarraySum(new int[] { -1, -1, 1 }, 0)); // 1
	}

	public static int subarraySum(int[] nums, int k) {
		Map<Integer, Integer> prefixSumCount = new HashMap<>();

		// Base case: prefix sum 0 occurs once
		prefixSumCount.put(0, 1);

		int currentSum = 0;
		int count = 0;

		for (int num : nums) {
			currentSum += num;

			// Check if (currentSum - k) exists
			if (prefixSumCount.containsKey(currentSum - k)) {
				count += prefixSumCount.get(currentSum - k);
			}

			// Store current prefix sum
			prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
		}

		return count;
	}
	
	public int subarraySumV2(int[] nums, int k) { //1, 1, 1
        int n=nums.length;
          int pre[]=new int[n];
          pre[0]=nums[0];
          for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
          }
          int ans=0;
          HashMap<Integer,Integer> hm=new HashMap<>();
           hm.put(0,1);
           for(int i=0;i<nums.length;i++){
            if(hm.containsKey(pre[i]-k)){
                ans+=hm.get(pre[i]-k);
            }
            hm.put(pre[i],hm.getOrDefault(pre[i],0)+1);
           }
           return ans;
    }

}
