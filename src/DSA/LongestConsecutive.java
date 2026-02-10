package DSA;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

	public static void main(String[] args) {
		System.out.println(longestConsecutive(new int[] {100, 4, 200, 0, 1, 3, 2}));
	}
	public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Start of sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
