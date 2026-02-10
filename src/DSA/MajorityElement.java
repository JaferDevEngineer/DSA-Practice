package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {3,2,3}));
	}

	private static int majorityElement(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i :nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		System.out.println(map);
		int maxValue = 0,highestNumber = 0;
		for(int j:map.keySet()) {
			if(maxValue < map.get(j)) {
				
				maxValue = map.get(j);
				highestNumber = j;
			}
			
		}
//		System.out.println(maxValue);
		return highestNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public int majorityElementV2(int[] nums) {
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int num:nums){
	            map.put(num,map.getOrDefault(num,1)+1);
	        }
	        int highest =0,value = 0 ;
	        for(Entry<Integer, Integer> m:map.entrySet()) {
	        	if(highest<m.getValue()) {
	        		highest = m.getValue();
	        	 	value = m.getKey();
	        	}
	        }
	        
	        return value;
	    }
}
