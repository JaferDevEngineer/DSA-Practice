package DSA;

public class findFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "abcdabdc";
		System.out.println(findFirstNonRepeatingCharacter(s));
		
		String s2 = "##$$%%";
		System.out.println(findFirstNonRepeatingCharacter(s2));
		
		String s3 = "Aa";
		System.out.println(findFirstNonRepeatingCharacter(s3));
	}

	private static Character findFirstNonRepeatingCharacter(String s) {
		// TODO Auto-generated method stub
		int length = s.length();
		if(length==0) return null;
		
		int[] count = new int[256]; //ascii values for the alphabets,numbers, special characeters
		
		for(int i=0; i<length; i++) {
			count[s.charAt(i)]++;
		}
		for(int i=0; i<length; i++) {
			if(count[s.charAt(i)] == 1)
				return s.charAt(i); 
		}
		
		return null;
	}
}
