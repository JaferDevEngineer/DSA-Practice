package DSA;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		System.out.println(missingNumberV2(new int[] {3,0,1}));
	}

	private static int missingNumber(int[] nums) {
		
		int[] arr = new int[nums.length+1];
		System.out.println("arr length "+arr.length);	
		for(int i:nums) {
			System.out.println("index "+i);
			arr[i]++;
		}
		for(int j = 0;j<arr.length;j++) {
			
			System.out.println("index in "+j +" value "+ arr[j]);
			if(arr[j] == 0)
				return j;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int missingNumberV2(int[] nums) { //3,0,1
		
		int[] arr = new int[nums.length+1];
		
		for(int i :nums) {
			arr[i]++;
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == 0)
				return i;
		}
		return 0;
		
	}
}
