package DSA;

public class Palindrome {

	public static void main(String[] args) {
//		String s = "A man, a plan, a canal: Panama";
//		System.out.println(checkPalindromeNew(s));
		String s = "0P";
		System.out.println(checkPalindromeNew(s));
//		System.out.println(Character.isAlphabetic('0'));
		
//		String s2 = "Aa";
//		System.out.println(checkPalindromeNew(s2.toLowerCase()));
//		
//		String s3 = "!@abc%baq#";
//		System.out.println(checkPalindromeNew(s3.toLowerCase()));
//		
//		String s4 = " aba ";
//		System.out.println(checkPalindrome(s4.toLowerCase()));
	}

	private static boolean checkPalindrome(String s) {
		
		s = s.toLowerCase();
		int left = 0, right = s.length() - 1;
		while (left < right) { //0<4 1<3
			Character.isDigit(0);
			
			if(!Character.isAlphabetic(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
				left++;
			}else if (!Character.isAlphabetic(s.charAt(right)) && !Character.isDigit(s.charAt(left))) {
				right--;
			}
			else if(s.charAt(left) != s.charAt(right)) {
				System.out.println("left "+left+" right "+right);
				System.out.println(s.charAt(left) +" "+s.charAt(right));
				return false;
			}else {
				left++;
				right--;
			}
		}
		return true;
	}
	
	
	
	public static boolean checkPalindromeNew(String s) {
		int left = 0 ,right = s.length()-1;
		
		while(left<right) {
			if(!Character.isAlphabetic(s.charAt(right))&& !Character.isDigit(s.charAt(right))) {
				right--;
			}else if (!Character.isAlphabetic(s.charAt(left))&& !Character.isDigit(s.charAt(left)) ) {
				left++;
			}else if (s.charAt(right)!= s.charAt(left)) {

				System.out.println(s.charAt(left) +" "+s.charAt(right));
				return false;
			}else {
				left++;
				right--;
			}
			
		}
		return true;
	}
}
