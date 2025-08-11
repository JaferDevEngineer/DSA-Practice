package DSA;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		System.out.println(new ContainerWithMostWater().containerWithMostWaterV2(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
	}

	private void containerWithMostWater(int[] nums) { // brute Force method

		int value = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				int newValue = (i - j) * Math.min(nums[i], nums[j]);
				if (newValue > value)
					value = newValue;

			}

		}
		System.out.println(value);

	}

	private int containerWithMostWaterV2(int[] nums) { // optimized method
		int start = 0, end = nums.length - 1, maxArea = -1;
		while (start < end) {
			int area = (end - start) * Math.min(nums[start], nums[end]);
			if (maxArea < area)
					maxArea = area;
			if (nums[start] < nums[end])
				start++;
			else
				end--;
		}
		return maxArea;
	}
}
