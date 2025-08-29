package DSA;

import java.util.Arrays;

public class FindLongestSubstring {

	public static void main(String[] args) {
		String s = "abacdc";
		System.out.println(findLongestSubstringV2(s));
	}

	private static int findLongestSubstringV2(String s) {

		int start = 0, max = 0;

		int[] arr = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (arr[current] > start) {
				start = arr[current];
			}
			arr[current] = i + 1;
			max = Math.max(max, i + 1 - start);

		}

		return max;
	}
}
