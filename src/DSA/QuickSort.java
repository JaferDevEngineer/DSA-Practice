package DSA;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 6, 5, 1, 4 };
		new QuickSort().quickSort(nums, 0, nums.length - 1);
	}



	public void quickSort(int[] nums, int start, int end) {
		if (start < end) {
			int partition = partition(nums, start, end);
			quickSort(nums, start, partition-1);
			quickSort(nums, partition+1, end);
		}
	}

	private int partition(int[] nums, int left, int right) {
		int pivot = nums[right], i = left;

		for (int j = left; j < right; j++) {
			if(nums[j] <= pivot) {
				
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
			}
		}
		int temp = nums[right];
		nums[right] = nums[i];
		nums[i] = temp;
		
		return i;
	}
}
