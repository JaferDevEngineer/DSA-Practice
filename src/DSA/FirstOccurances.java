package DSA;

public class FirstOccurances {
	public static void main(String[] args) {
		String s1 = "ZOHOCORPORATION", s2 = "PORT";

		System.out.println(s2.charAt(0));
		System.out.println(s1.indexOf('P'));
//		firstOccurances(s1, s2);
//		System.out.println(s2.charAt(1));
//		System.out.println(s1.indexOf(s2.charAt(1)));
		
		
	}

	private static void firstOccurances(String s1, String s2) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < s2.length(); i++) { //min = 7,max = 7

			int index = s1.indexOf(s2.charAt(i));

			if (index <= min)
				min = index;
			if (index >= max)
				max = index;

		}
		System.out.println("min " + min + " max " + max);
		System.out.println(s1.substring(min, max + 1));
//		System.out.println(substring(s1, min, max));
	}

	private static String substring(String s1, int min, int max) {
		String s = "";
		for (int i = min; i <= max; i++) {
			s += s1.charAt(i);
		}
		return s;
	}
}
