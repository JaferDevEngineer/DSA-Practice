package DSA;

import java.util.Arrays;

public class ProductExceptSelfWithDivision {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelfWithDivisionV2(new int[] { 0, 1, 2, 3, 4 })));
	}

	public static int[] productExceptSelfWithDivision(int[] nums) {
		int n = nums.length;
		int[] output = new int[n];

		// First, compute the product of all non-zero elements
		long totalProduct = 1;
		int zeroCount = 0;
		for (int num : nums) {
			if (num == 0) {
				zeroCount++;
				// If more than one zero, all answers will be zero
				if (zeroCount > 1)
					break;
			} else {
				totalProduct *= num;
			}
		}

		System.out.println("totalProduct " + totalProduct);
		// Build the output array using division and zero-count logic
		for (int i = 0; i < n; i++) {
			if (zeroCount == 0) {
				// No zeros: just divide totalProduct by nums[i]
				output[i] = (int) (totalProduct / nums[i]);
			} else if (zeroCount == 1) {
				// Exactly one zero: only the position with zero gets totalProduct,
				// others are zero because they'd include that zero in their product
				output[i] = (nums[i] == 0) ? (int) totalProduct : 0;
			} else {
				// Two or more zeros: every product except self is zero
				output[i] = 0;
			}
		}

		return output;
	}

	public static int[] productExceptSelfWithDivisionV2(int[] nums) {

		int length = nums.length, zeroCount = 0, totalProduct = 1;
		int[] output = new int[length];

		for (int num : nums) {
			if (num == 0) {
				zeroCount++;
				if (zeroCount > 1) {
					break;
				}
			} else {
				totalProduct *= num;
			}

		}
		for (int i = 0; i < length; i++) {
			if(zeroCount == 0)
				output[i] = (int) totalProduct/nums[i];
			else if(zeroCount == 1)
				output[i] = nums[i] == 0 ? totalProduct:0;
			else
				output[i] = 0;
		}
		return output;
	}
}
