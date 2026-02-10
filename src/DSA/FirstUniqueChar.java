package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
public static void main(String[] args) {
	System.out.println(firstUniqChar("leetcode"));
}
public static int firstUniqChar(String s) {
    
	int[] arr = new int[26];
	
	for(char c: s.toCharArray()) {
		arr[c-'a']++;
	}
	
	for(int i = 0;i<s.length();i++) {
		if(arr[s.charAt(i) - 'a'] == 1) {
			return i;
		}
	}
	System.out.println(Arrays.toString(arr));
    return -1;



}

}
