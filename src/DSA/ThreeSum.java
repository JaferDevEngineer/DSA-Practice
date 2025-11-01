package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
//		System.out.println(new ThreeSum().threeSumV2(new int[] { -1, 0, 1, 2, -1, -4 }));
//
//		System.out.println(new ThreeSum().threeSumV2(new int[] {0,0,0,0 }));

		System.out.println(new ThreeSum().threeSumV2(new int[] {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10}));
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
				}else if (sum < 0) {
					left++;
				}else {
					right --;
				}
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private List<List<Integer>> threeSumV2(int[] nums) { // [-4, -1, -1, 0, 1, 2]
		
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		int size = nums.length;
//		int left = 1;
//		int right = size - 1;
		System.out.println("in "+Arrays.toString(nums));
		for (int i = 0; i < size; i++) {
			int left = i + 1;
			int right = size - 1;
//			int main = nums[i];
//			System.out.println(main);
			if (i > 0 && nums[i] == nums[i-1]) continue;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				System.out.println("main "+i +" =>"+nums[i]+" left "+left+" => "+nums[left]+" right "+right+" => "+nums[right]+" sum "+sum);
				if ( sum == 0) {
					list.add(Arrays.asList(nums[i],nums[left],nums[right]));
					
					while(left<right && nums[left] == nums[left+1])
						left++;
					while(left<right && nums[right] == nums[right-1])
						right--;
					
					left++;
					right--;
				}else if(sum < 0 ) {
					left++;
				}else {
					right--;
				}
//				break;
			}
		}

		return list;
		
	}
}
