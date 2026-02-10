package DSA;

import java.util.Arrays;

public class ReverseAInteger {
	public static void main(String[] args) {
		reverseArrayInteger(new int[] { 1, 2, 3, 4, 5 });
	}

	private static void reverseArrayInteger(int[] is) {
		int left = 0,right = is.length - 1;
		
		
		while(left<right) {
			int temp = is[left];
			is[left] = is[right];
			is[right] = temp;
			left++;
			right --;
		}
		System.out.println(Arrays.toString(is));

	}
}
