package DSA;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new MoveZeroes().moveZeroes(new int[] { 0, 1, 0, 3, 12 })));
	}
 //  i = 0 = 0, 1, 0, 3, 12   j = 0
 //  i = 1 = 1, 0, 0, 3, 12   j = 1
 //  i = 2 = 1, 0, 0, 3, 12   j = 1
 //	 i = 3 = 1, 3, 0, 0, 12   j = 2
 //  i = 4 = 1, 3, 0, 0, 12   j = 3
	private int[] moveZeroes(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
		return nums;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
