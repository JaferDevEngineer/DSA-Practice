package DSA;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithKDistinct {
	public static void main(String[] args) {
		System.out.println(new LongestSubArrayWithKDistinct().solution(new int[] { 1, 2, 1, 2, 3 }, 2));
	}

	private int solution(int[] arr, int k) {
		int maxSize = 0, left = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int right = 0; right < arr.length; right++) {

			map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

			while (map.size() > k) {
				map.put(arr[right], map.get(arr[right]) - 1);
				if (map.get(arr[right]) == 0) {
					map.remove(arr[right]);
				}
				left++;

			}
			maxSize = Math.max(maxSize, right - left + 1);
		}
		return maxSize;

	}
}
