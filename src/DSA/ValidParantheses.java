package DSA;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>(); // 

		// Iterate through each character in the string
		for (char c : s.toCharArray()) { // (] // ()
			// Push opening brackets onto the stack
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			// Handle closing brackets
			else {
				// If stack is empty or top doesn't match, return false
				if (stack.isEmpty())
					return false;

				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false;
				}
			}
		}

		// The stack should be empty if the string is valid
		return stack.isEmpty();
	}

	public static boolean isValidV2(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			if (c == '{' || c == '(' || c == '[')
				stack.push(c);
			else {

				if (stack.isEmpty())
					return false;

				char top = stack.pop();
				if ((c == '}' && top != '{') || (c == ')' && top != '(') || (c == ']' && top != '['))
					return false;
			}
		}
		return stack.isEmpty();
	}


	private static boolean isValidV3(String string) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char c:string.toCharArray()) {
			if(c== '{' || c=='(' || c=='[')
				stack.push(c);
			else {
				if(stack.isEmpty())
					return false;
				
				char top =stack.pop();
				if((c==')'&& top !='(')||(c==']'&& top !='[')||(c=='}'&& top !='{'))
					return false;
			}
		}
		return stack.isEmpty();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		System.out.println(isValidV2("()")); // true
//		System.out.println(isValidV2("()[]{}")); // true
//		System.out.println(isValidV2("(]")); // false
		
		System.out.println(validParanthese("]")); // true
//		System.out.println(isValidV3("([])")); // true
	}
	
	private static boolean validParanthese(String s) { // ()
		Stack<Character> stack = new Stack<>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
			} else {
				if(stack.isEmpty())
					return false;
				char top = stack.pop();
				System.out.println("c "+c+" top "+top);
				if((c==')'&& top!='(') || (c==']'&& top!='[') || (c=='}'&& top!='{')) {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}
}
