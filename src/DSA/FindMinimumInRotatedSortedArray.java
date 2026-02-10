package DSA;

public class FindMinimumInRotatedSortedArray {
	public static void main(String[] args) {
//		System.out.println(solution(new int[] { 3, 4, 5, 1, 2 }));

//		System.out.println(solution(new int[] {2,1 }));
		System.out.println((1+0)/2);
	}

	private static int solution(int[] nums) {

		int max = nums.length -1, low = 0, min = Integer.MAX_VALUE;

		while (low <= max) {
			int mid = (max + low) / 2;

			if (nums[mid] >= nums[low]) {
				min = Math.min(min, nums[low]);
				low = mid + 1;

			} else {
				min = Math.min(min, nums[mid]);
				max = mid - 1;
			}
		}
		return min;
	}
}
