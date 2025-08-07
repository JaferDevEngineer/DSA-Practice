package DSA;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {3,2,3}));
	}

	private static int majorityElement(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i :nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int maxValue = 0,highestNumber = 0;
		for(int j:map.keySet()) {
			if(maxValue < map.get(j)) {
				
				maxValue = map.get(j);
				highestNumber = j;
			}
			
		}
		System.out.println(maxValue);
		return highestNumber;
	}
}
