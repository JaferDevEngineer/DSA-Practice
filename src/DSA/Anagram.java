package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
//	public static void main(String[] args) {
//
//	}
//
//	public static boolean isAnagram(String s, String t) {
//
//		s= s.toLowerCase();
//		t=t.toLowerCase();
//		
//		if(s.length()==t.length())
//			return false;
//		int i = 0,j=0,count =0;
//		Map<Character,Integer> map = new HashMap<>();
//		while(i<s.length()) {
//			if(map.containsKey(s.charAt(i))) {
//				 count = map.get(s.charAt(i))+1;
//			}else {
//				count =1;
//			}
//				
//			map.put(s.charAt(i), count);
//			i++;
//		}
//		
//		while(j<t.length()) {
//			if(map.containsKey(s.charAt(j))) {
//				 count = map.get(s.charAt(j))+1;
//			}else 
//				count =1;
//			}
//				
//			map.put(s.charAt(j), count);
//			j++;
//		}
//		
//		return false;
//	}

	public static boolean isAnagramV4(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		int[] count = new int[26];
		for (int i = 0; i < s1.length(); i++) {

			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;

		}
		for (int i : count) {
			if (i != 0)
				return false;
		}
		return true;
	}

	public static boolean isAnagram(String s, String t) {
		// If lengths differ, they cannot be anagrams
		if (s.length() != t.length()) {
			return false;
		}

		// Use an array to count character frequencies for lowercase English letters
		int[] charCounts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			charCounts[s.charAt(i) - 'a']++; // Increment for character in 's'
			charCounts[t.charAt(i) - 'a']--; // Decrement for character in 't'

		}
		System.out.println(Arrays.toString(charCounts));
		// Check if all counts are zero
		for (int count : charCounts) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// Test cases
//        System.out.println(isAnagramV2("anagram", "nagaram")); // true
//        System.out.println(isAnagramV2("rat", "car"));         // false
        System.out.println(isAnagramV4("a", "a"));             // true
		System.out.println(isAnagramV4("abc", "def")); // false

		System.out.println('a' - 'a');

	}

	private static boolean isAnagramV2(String t, String s) {
		if (t.length() != s.length())
			return false;

		int[] character = new int[26];

		for (int i = 0; i < s.length(); i++) {
			character[s.charAt(i) - 'a']++;
			character[t.charAt(i) - 'a']--;
		}
		for (int c : character) {
			if (c != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAnagramV3(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		for (int j = 0; j < t.length(); j++) {
			if (--count[t.charAt(j) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}

}
