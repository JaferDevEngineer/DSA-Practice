package DSA;

public class MissingNumber {
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {0,1}));
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
}
