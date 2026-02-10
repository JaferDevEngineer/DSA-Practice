package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String[] args) {
		System.out.println(new GroupAnagrams().groupAnagramsV2(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
	}

	private List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map = new HashMap<>();
		
		for(String s:strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String word = new String(charArray);
			if(!map.containsKey(word))
				map.put(word, new ArrayList<>());
			map.get(word).add(s);
		}
		return new ArrayList<>(map.values());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public List<List<String>> groupAnagramsV2(String[] strs) {
		 Map<String,List<String>> map = new HashMap<>();
		 for(String s:strs) {
			 char[] chars = s.toCharArray();
			 Arrays.sort(chars);
			 String word = new String(chars);

			 if(!map.containsKey(word))
				 map.put(word, new ArrayList<>());
			 map.get(word).add(s);
		 }
		return new ArrayList<>(map.values());
	        
	    }
}
