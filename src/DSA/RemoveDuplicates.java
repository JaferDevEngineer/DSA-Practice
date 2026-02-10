package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		removeDuplicatesV2(new int[] {0,0,1,1,1,2,2,3,3,4});

		removeDuplicatesV2(new int[] {1,1,2});
	}

	private static int removeDuplicates(int[] nums) {
		 Set<Integer> set = new HashSet<>();
		   int start = 0,advance = 1 ;

//		   System.out.println(le);
		   set.add(nums[start]);
		   while(advance<nums.length) {
	            if(!set.add(nums[advance])){
	                advance++;
	            } else {
	            	start++;
	            	 nums[start] = nums[advance];
	            	 
	            }
	        }
		   System.out.println(Arrays.toString(nums) +" count "+start );
		   return start + 1;
	}
	
	//optimized verse
	private static int removeDuplicatesV2(int[] nums) {
		
		if(nums.length == 0) return 0;
		int index = 1;
		
		for(int i = 1;i<nums.length;i++) {
			if(nums[i] != nums[i-1]) {
				nums[index] = nums[i];
				index++;
				
			}
		}
		
		return index;
	}
}
