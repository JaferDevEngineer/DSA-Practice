package DSA;

public class SearchInRotatedArray {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,5,6,7,0,1,2}, 1));
	}

	private static int solution(int[] nums, int target) {
		
		int low = 0,high = nums.length -1;
		
		while(low<=high) {
			int mid = (high+low)/2;
			if(target == nums[mid])
				return mid;
			if(nums[low]<=nums[mid]) {
				
				if(nums[low]<=target && target<=nums[mid]) {
					high = mid - 1;
				}else {
					low = mid+1;
				}
			}else {
				if(target>=nums[mid] && target<= nums[high]) {
					low = mid+1;
				}else {
					high = mid -1;
				}
			}
		}
		return -1;
	}
}
