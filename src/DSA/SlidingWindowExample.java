package DSA;

import javax.management.RuntimeErrorException;

public class SlidingWindowExample {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;

		int result = maxSumOfK(arr, k);
		System.out.println("Maximum Sum of any " + k + " consecutive elements: " + result);
	}

	private static int maxSumOfK(int[] arr, int k) {
		int size = arr.length;

		if (size < k)
			throw new IllegalArgumentException(" k is need to be greater than arr");

		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}

		System.out.println(windowSum);

		int maxSum = windowSum;

		for (int right = k; right < size; right++) {
			windowSum -= arr[right - k];
			windowSum += arr[right];

			maxSum = Math.max(maxSum, windowSum);

		}
		return maxSum;
	}
}
