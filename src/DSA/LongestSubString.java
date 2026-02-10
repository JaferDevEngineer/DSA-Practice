package DSA;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
	

	private int longestSS(String s) {

		int maxSum = 0,left = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(int right = 0;right<s.length();right++) {
			
			
			char c = s.charAt(right);
			
			if(map.containsKey(c) && map.get(c)>=left) {
				left = map.get(c)+1;
			}
			map.put(c, right);
			maxSum = Math.max(maxSum, right -left +1);
		}
		return maxSum;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(new LongestSubString().longestSSV2("abcabcaabbd"));
	}
	
	
	private int longestSSV2(String s) { //abcabcaabbd
		
		
		Map<Character,Integer> map =  new HashMap<>();
		
		int left = 0,maxLen = 0;
		for(int right = 0 ;right<s.length();right++) {
			char ch = s.charAt(right);
			System.out.println("ch "+ch);
			if(map.containsKey(ch)) {
				left = map.get(ch)+1;
			}
			map.put(ch, right);
			System.out.println("left "+left +" right "+right);
			maxLen = Math.max(maxLen, right - left+1);
			System.out.println("max "+maxLen);
			
			
			
			
		}
		
		return 0;
	}
}
