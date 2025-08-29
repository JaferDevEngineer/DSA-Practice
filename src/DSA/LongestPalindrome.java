package DSA;

public class LongestPalindrome {
	public static void main(String[] args) {
		String d = "bb";
//		System.out.println(d.substring(1, 3));
//		System.out.println(new LongestPalindrome().longestPolindrome(d));
		System.out.println(new LongestPalindrome().longestPolindromeV2(d));
	}

	private String longestPolindrome(String s) {
		 if (s == null || s.length() < 2) return s; // "" or single char

	        int start = 0, end = 0; // best window [start..end]

	        for (int i = 0; i < s.length(); i++) {
	            // Expand for odd-length palindromes (center at i)
//	        	System.out.println("s "+);
	            int len1 = expand(s, i, i);

	            // Expand for even-length palindromes (center between i and i+1)
	            int len2 = expand(s, i, i + 1);
	            System.out.println("len1 "+len1 + " len2 "+len2);

	            int len = Math.max(len1, len2);

	            // If this center gives a longer palindrome, update window
	            if (len > end - start + 1) {
	            	System.out.println("in");
	                // map center i and length len to [start..end]
	                start = i - (len - 1) / 2;
	                end   = i +  len      / 2;
	            }
	            System.out.println();
	        }
	        System.out.println(start+" "+end);
	        return s.substring(start, end + 1);
	}
	 private int expand(String s, int L, int R) {
	        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {//  l =1,r =1
	            L--; // -1 
	            R++; //  1
	        }
	        // when while breaks, [L+1..R-1] is last valid palindrome
	        System.out.println(R+" - " + L +" - "+ 1+" "+ (  R - L - 1));
	        return R - L - 1; // 3 - -1 -1 
	    }

	private String longestPolindromeV2(String s) {
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len = frontAndBackPalindrome(s, i, i);
			int len2 = frontAndBackPalindrome(s, i, i + 1);

			int highest = Math.max(len, len2);

			if (highest > end - start + 1) {
				start = i - (highest - 1) / 2;
				end = i + highest / 2;
//				System.out.println(start+" "+end);
			}
		}

        System.out.println(start+" "+end);
		return s.substring(start, end+1);
	}

	private int frontAndBackPalindrome(String s, int l, int r) {
		while (l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)) {
			l--;
			r++;
		}
		return r - l - 1;
	}
}
