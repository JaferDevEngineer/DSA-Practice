package DSA;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		// Create a HashMap to store the number and its index
		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i]; // Calculate complement
			System.out.println("complement " + complement);
			// Check if the complement is already in the map
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i }; // Return indices
			}

			System.out.println("nums[i] " + nums[i] + " i " + i);
			// Store the current number and its index in the map
			map.put(nums[i], i);
		}

		// If no solution is found (not needed, as input guarantees one solution)
		
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		// Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSumV3(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

//        // Example 2
//		int[] nums2 = { 3, 1, 2, 4 };
//		int target2 = 6;
//		int[] result2 = twoSumV3(nums2, target2);
//		System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
//
//        // Example 3
//        int[] nums3 = {3, 3};
//        int target3 = 6;
//        int[] result3 = twoSum(nums3, target3);
//        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
	}

	public static int[] twoSumV2(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}

	public static int[] twoSumV3(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int remaining = target - nums[i];
			if(map.containsKey(remaining)) {
				return new int[] {map.get(remaining), i};
			}
			map.put(nums[i], i);
		}

		return new int[] { -1 };
	}
}
