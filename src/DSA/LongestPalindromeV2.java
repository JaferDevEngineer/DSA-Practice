package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestPalindromeV2 {

	public static void main(String[] args) {
	longestPalindrome("cbbd");	
	}
	 public static String longestPalindrome(String s) {
	        
		 Set<Character> set = new HashSet<>();
		 List<String> palidromes = new ArrayList<>();
		 int left = 0;
		 for(int right =0;right<s.length();right++) {
			 
			 if(set.contains(s.charAt(right))) {
				 set.remove(s.charAt(right));
				 palidromes.add(s.substring(left, right+1));
				 right = left+1;
				 left = right;
			 }else {
				 set.add(s.charAt(right));
			 }
			 
		 }
		 String longest = "";
		 int max = 0;
		 for(String v: palidromes) {
			 if(max<v.length()) {
				 max = v.length();
				 longest = v;
				 
			 }
		 }
		 System.out.println("longest "+longest);
//		 palidromes.stream().max();
		 return longest;
	    }
}
