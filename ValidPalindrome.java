package DSA;

public class ValidPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindromeV3("0P"));
//		System.out.println(Character.isLetterOrDigit("0^".charAt(1)));

	}

	public static boolean isPalindromeV3(String s) {
		System.out.println(s);
		s = s.toLowerCase();
		System.out.println(s);
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			} else if (!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			} else if (s.charAt(right) != s.charAt(left)) {
				return false;
			} else {
				left++;
				right--;
			}
		}
		return true;
	}

	public static boolean isPalindrome(String s) {
		if (s.isEmpty())
			return true;
		System.out.println(s);
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(s);
		int left = 0, right = s.length() - 1;
		System.out.println(s.charAt(left) + " " + s.charAt(right) + " length " + s.length());
		while (left < right) {
			System.out.println("left " + left + " right " + right);
			System.out.println("left " + left + " " + s.charAt(left) + " right " + right + " " + s.charAt(right));
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static boolean isPalindromeV2(String s) {
		if (s.isEmpty())
			return true;
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
