package DSA;

public class MinSubArrayLen {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 2, 3, 2 };
		int target = 7;

		System.out.println(minSubArrayLen(target, arr)); // Output: 2 → [5,2]
	}

	public static int minSubArrayLen(int target, int[] arr) { // 2, 1, 5, 2, 3, 2

		int sum = 0, min = Integer.MAX_VALUE, left = 0;
		for (int right = 0; right < arr.length; right++) {
			sum += arr[right];

			while (sum >= target) {
				min = Math.min(min, right - left + 1);
				sum -= arr[left];
				left++;
			}
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}
}
