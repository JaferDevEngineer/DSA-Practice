package DSA;

import java.util.Arrays;

public class SecondLargesNumber {

	private static int secondLargestNumber(int[] num) {

		int size = num.length, i = 0, highest = 0, secondHighest = 0;

		while (i < size) {

			if (num[i] > highest) {
				highest = num[i];
			} else if (num[i] < highest && num[i] > secondHighest) {
				secondHighest = num[i];
			}
			i++;

		}
		return secondHighest;
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		int arr1[] = { 4, 6, 5, 1, 2 };
		System.out.println(secondLargestNumberV2(arr1));

		int arr2[] = {};
		System.out.println(secondLargestNumberV2(arr2));
		
		int arr3[] = {5,5,5};
		System.out.println(secondLargestNumberV2(arr3));
		
		int arr4[] = {5,5,4};
		System.out.println(secondLargestNumberV2(arr4));
		
		int arr5[] = {-2,-3,10,10};
		System.out.println(secondLargestNumberV2(arr5));

		int arr6[] = {-1,-1,-1};
		System.out.println(secondLargestNumberV2(arr6));

	}

	private static int secondLargestNumberV2(int[] nums) {

		if (nums.length <= 1)
			return -1;
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
//-1,-1,-1
		for (int num : nums) {
			if (max < num) {
				secondMax = max;
				max = num;
			} else if (secondMax < num && num!=max) {
				secondMax = num;
			}
		}
		
		if(secondMax == Integer.MIN_VALUE)
			return max;
		return secondMax;
	}
}
