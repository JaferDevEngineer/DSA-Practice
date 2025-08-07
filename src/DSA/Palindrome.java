package DSA;

public class Palindrome {

	public static void main(String[] args) {
		String s = "abcba";
		System.out.println(checkPalindrome(s));
		
		String s2 = "Aa";
		System.out.println(checkPalindrome(s2.toLowerCase()));
		
		String s3 = "!@abc%ba#";
		System.out.println(checkPalindrome(s3.toLowerCase()));
		
		String s4 = " aba ";
		System.out.println(checkPalindrome(s4.toLowerCase()));
	}

	private static boolean checkPalindrome(String s) {

		int left = 0, right = s.length() - 1;
		while (left < right) { //0<4 1<3
			
			if(!Character.isAlphabetic(s.charAt(left))) {
				left++;
			}else if (!Character.isAlphabetic(s.charAt(right))) {
				right--;
			}
			else if(s.charAt(left) != s.charAt(right)) {
				return false;
			}else {
				left++;
				right--;
			}
		}
		return true;
	}
}
