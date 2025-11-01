package DSA;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
	}
	public boolean containsDuplicte(int[] nums) {
		 Set<Integer> set = new HashSet<>();

	        for(int n:nums){
	            if(!set.add(n)) return true;
	        }
	        return false;
	}
	
}
