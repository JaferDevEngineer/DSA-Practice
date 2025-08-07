package DSA;

public class FindLongestSubstring {

	public static void main(String[] args) {
		String s = "abacdc";
		System.out.println(findLongestSubstring(s));
	}

	private static int findLongestSubstring(String s) {
		int start = 0;
		int max = 0;
		int[] lastSeen = new int[256];

		for (int i = 0; i < s.length(); i++) { // 0 //1 //2 //3 //4 //5
			char currentCharacter = s.charAt(i); // a //b //a //c //d //c
			if (lastSeen[currentCharacter] > start) {// false //false // true //false //false // true
				start = lastSeen[currentCharacter];// // // start=1 // // start=4
			}
			lastSeen[currentCharacter] = i + 1; // a=1 //b=2 //a=3 //c=4 // d= 5 // c= 6
			max = Math.max(max, i + 1 - start); // Math.max(0,0+1 - 0) = 1 // Math.max(1,1+1 - 0) = 2 // Math.max(2,2+1
												// - 1) = 2 // Math.max(2,3+1 - 1) = 3 // Math.max(3,4+1 - 1) =4
												// ,//Math.max(4,5+1 - 1) =4
		}
		return max;
	}
}
