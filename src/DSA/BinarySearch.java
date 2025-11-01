package DSA;

public class BinarySearch {
	

	private static int searchV2(int[] arr, int i) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == i) {
				return mid;
			} else if (arr[mid] > i) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

//	public static int search(int[] nums, int target) {
//
//		int low = 0, high = nums.length - 1;
//
//		while (low <= high) {
//			int mid = low + (high - low) / 2;
//
//			if (nums[mid] == target)
//				return mid;
//			else if (nums[mid] > target)
//				high = mid - 1;
//			else
//				low = mid + 1;
//		}
//
//		return -1;
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(searchV3(new int[] { -1, 0, 3, 5, 9, 12 }, 0));
//		System.out.println(0 + (5 - 0) / 2);
		System.out.println(6/2);

	}
	
	private static int searchV3(int[] arr, int target) { // -1, 0, 3, 5, 9, 12  //9
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = low+(high - low )/2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target ) {
				high = mid -1;
			}else if(arr[mid] < target) {
				low = mid+1;
			}
			mid = high-low /2;
		}

		return -1;
	}
}
