package DSA;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverseStringV3(s);
		System.out.println(s);

	}

	private static void reverseString(char[] s) {

		char[] newS = new char[s.length];
		int j = 0;
		for (int i = s.length - 1; i >= 0; i--) {
			newS[j] = s[i];
			j++;
		}
		s = newS;
		System.out.println("s " + Arrays.toString(s) + " newS " + Arrays.toString(newS));
	}

	private static void reverseStringV2(char[] s) {

		int low = 0, high = s.length - 1;
		while (low <= high) {
			char temp = s[low];
			s[low] = s[high];
			s[high] = temp;
			low++;
			high--;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static void reverseStringV3(char[] s) {
		int low = 0, high = s.length - 1;

		while (low <= high) {
			char temp = s[low];
			s[low] = s[high];
			s[high] = temp;
			low++;
			high--;
		}
	}
}
