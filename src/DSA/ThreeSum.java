package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		new ThreeSum().threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
	}

	private List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();

		int size = nums.length;
		for (int i = 0; i < nums.length; i++) {

			int left = i + 1, right = size - 1;

			if (i > 0 && nums[i] == nums[i-1]) continue;
			
			while (left < right) {
				int sum = nums[i]+nums[left]+nums[right];
				if(sum == 0) {
					list.add(Arrays.asList(nums[i],nums[left],nums[right]));
					
					while(left<right && nums[left] == nums[left+1])
						left++;
					while(left<right && nums[right] == nums[right -1 ])
						right--;
					left++;
					right--;
				}else if (sum<0) {
					left++;
				}else {
					right --;
				}
			}
		}
		return list;
	}
}
