package DSA;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelfV3(new int[] { 1, 2, 3, 4 })));
//		System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(new int[] {-1,1,0,-3,3})));
//		System.out.println(1*-1);
	}

	public int[] productExceptSelfV3(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];
		result[0] = 1;
		for(int i = 1; i<length;i++) {
			result[i] = result[i-1] * nums[i-1];
		}
		System.out.println(Arrays.toString(result));
		
		int multiply = 1;
		for(int i = length - 1;i>=0;i--) {
			result[i] = result[i] * multiply;
			multiply*=nums[i];
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private int[] productExceptSelf(int[] nums) {

		int n = nums.length;
		int[] result = new int[n];

		// Step 1: Calculate prefix products
		result[0] = 1;
		for (int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1]; //1,2,3,4
//			System.out.println("prefix act " + Arrays.toString(result));
		}

		System.out.println("prefix " + Arrays.toString(result));
		// Step 2: Multiply with suffix products (in-place)
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * suffix;
			suffix *= nums[i];
		}

		return result;

	}

	private int[] productExceptSelfV2(int[] nums) {
		int length = nums.length;
		int[] output = new int[length];
		output[0] = 1;
		for(int i=1; i<length;i++) {
			output[i] = output[i-1] * nums[i-1];
		}
		int suffix = 1;
		for(int i = length-1;i>=0;i--) {
			output[i] = output[i] * suffix;
			
			suffix *=nums[i]; //4 
			
		}
		return output;
		
		
	}
}
