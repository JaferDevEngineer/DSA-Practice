package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
	public static void main(String[] args) {
//		System.out.println(singleNumberUsingXOR(new int[] { 2, 2, 1 }));
//		System.out.println(singleNumberUsingInHashMap(new int[] { 2, 2, 1 }));
		System.out.println(singleNumberUsingInHashSet(new int[] { 2, 2, 1,1,3 }));
//		System.out.println(3^1);
	}

	private static int singleNumberUsingInHashSet(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (set.contains(i))
				set.remove(i);
			else
				set.add(i);

		}

		return set.iterator().next();
	}

	private static int singleNumberUsingInHashMap(int[] nums) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i :nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(int j :map.keySet()) {
			if(map.get(j) == 1)
				return j;
		}
		return -1;
	}

	private static int singleNumberUsingXOR(int[] nums) {
		int result = 0;
		for(int i :nums) {
			result ^=i;
		}
		return result;
	}
}
