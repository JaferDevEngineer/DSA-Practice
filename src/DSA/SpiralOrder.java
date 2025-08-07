package DSA;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

	public static void main(String[] args) {
		System.out.println(new SpiralOrder().spiralOrderV2(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		}));

//		System.out.println(new SpiralOrder().spiralOrder(new int[][] { 
//			{ 1, 2, 3, 4 }, 
//			{ 5, 6, 7, 8 },
//			{ 9, 10, 11, 12 }
//
//		}));
//		System.out.println(new SpiralOrder().spiralOrder(new int[][] {{2,3} }));

//		System.out.println(new SpiralOrder().spiralOrder(new int[][] { 
//			{ 7 }, 
//			{ 9 }, 
//			{ 6 } 
//			
//			}));
//		System.out.println(new SpiralOrder().spiralOrder(new int[][] {
//			{ 2, 5, 8 }, 
//			{ 4, 0, -1 }
//			
//			}));
		System.out.println(new SpiralOrder().spiralOrderV2(new int[][] {
		{ 1,  2,  3,  4 }, 
		{ 5,  6,  7,  8 }, 
		{ 9,  10, 11, 12 }, 
		{ 13, 14, 15, 16 }, 
		{ 17, 18, 19, 20 }, 
		{ 21, 22, 23, 24 },
		}));
		// [[1,2,3,4],[5,6,7,8],[9,10,11,12]]

		// [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16],[17,18,19,20],[21,22,23,24]]
	}
//	private List<Integer> spiralOrder(int[][] nums) {
//		
//	}

	private List<Integer> validate(int[][] nums, List<Integer> list) {
		for (int i = 0; i < nums[0].length; i++) {
			list.add(nums[0][i]);
		}
		System.out.println(list);
		if (nums.length > 1) {
			for (int i = 1; i < nums.length; i++) {
				list.add(nums[i][nums[0].length - 1]);
			}
			System.out.println("1 " + list);
			for (int i = nums[0].length - 2; i >= 0; i--) {
				list.add(nums[nums.length - 1][i]);
			}
			System.out.println("2 " + list);
			if (nums[0].length > 1) {
				for (int i = nums.length - 2; i > 0; i--) {
					list.add(nums[i][0]);
				}
			}
		}
		return null;
//			if (nums.length > 2)
//				for (int i = 1; i < nums[0].length - 1; i++) {
//					list.add(nums[1][i]);
//				}
//			System.out.println("4 " + list);
	}

	private List<Integer> spiralOrder(int[][] nums) {

		List<Integer> list = new ArrayList<Integer>();
		return validate(nums, list);
	}

//	{ 1, 2, 3 }, 
//	{ 4, 5, 6 }, 
//	{ 7, 8, 9 } 
	private List<Integer> spiralOrderV2(int[][] nums) {

		List<Integer> list = new ArrayList<>();
		int column = nums.length, rows = nums[0].length, top = 0, bottom = column - 1, left = 0, right = rows - 1;

		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				list.add(nums[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				list.add(nums[i][right]);
			}
			right--;

			
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					list.add(nums[bottom][i]);
				}
				bottom--;
			}
			if(left<=right) {
				for(int i = bottom;i>=top;i--) {
					list.add(nums[i][left]);
				}
				left++;
			}

		}

		return list;
	}
}
