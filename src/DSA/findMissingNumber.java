package DSA;

public class findMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 0 };
		System.out.println(findMissingNumber(arr));
		
		int arr2[] = {  };
		System.out.println(findMissingNumber(arr2));
		
		int arr3[] = { 1,2 };
		System.out.println(findMissingNumber(arr3));
	}

	private static int findMissingNumber(int[] arr) {
		int length = arr.length;
		if(length==0) return 0;
		int total = length * (length + 1) / 2;
		for (int n : arr) {
			total -= n;
		}
		return total;
	}
}
