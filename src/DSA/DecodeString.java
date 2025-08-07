package DSA;

import java.util.*;

public class DecodeString {
	public static void main(String[] args) {
		String input = "3[a2[c]]";
	        System.out.println(decodeString(input)); // Output: accaccacc
//	        for(char s:input.toCharArray()) {
//	        	if (Character.isDigit(s)) {
//	        		System.out.println((s - '0'));
//	        	}
//	        	System.out.println(s);
//	        }
		char ch = '3';
//		char ch1 = '0';
//		int num = ch;
//		int num2 = ch1;
//		System.out.println(num +" "+ num2);
//		System.out.println(num - '0');
		int k =0;
		k = k * 10 + (ch - '0');
//		System.out.println(k);
	}

	public static String decodeString(String s) {
		Stack<Integer> countStack = new Stack<>();
		Stack<StringBuilder> strStack = new Stack<>();
		StringBuilder currentStr = new StringBuilder();
		int k = 0;

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				k = k * 10 + (ch - '0'); // k=3
			} else if (ch == '[') {
				countStack.push(k);
				strStack.push(currentStr);
				currentStr = new StringBuilder();
				k = 0;
			} else if (ch == ']') {
				int repeatTimes = countStack.pop();
				StringBuilder decoded = strStack.pop();
				for (int i = 0; i < repeatTimes; i++) {
					decoded.append(currentStr);
				}
				currentStr = decoded;
			} else {
				currentStr.append(ch);
			}
		}

		return currentStr.toString();
	}

}
