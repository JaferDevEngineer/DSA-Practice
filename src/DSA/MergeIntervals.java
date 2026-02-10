package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	private int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); //

		System.out.println("Sorted : ");
		for (int[] i : intervals) {
			System.out.println("          " + Arrays.toString(i));
		}

		int[][] answer = new int[intervals.length][2];
		int[] previousIndex = intervals[0];
		int index = 1;

		if (intervals.length <= 1)
			return intervals;

		for (int i = 1; i < intervals.length; i++) {
			System.out.println("previousIndex[1] " + previousIndex[1] + " intervals[i][0] " + intervals[i][0]);
			System.out.println(intervals[i][0] + " <= " + previousIndex[1]);
			if (intervals[i][0] <= previousIndex[1]) {// {1,3} {2,6} // {1,6}{8,10}

//				System.out.println(" Hello "x
//						+ Arrays.toString(new int[] { previousIndex[0], Math.max(previousIndex[1], intervals[i][1]) }));

				answer[index - 1] = new int[] { previousIndex[0], Math.max(previousIndex[1], intervals[i][1]) };
				previousIndex = answer[index - 1];
				for (int[] j : answer) {
					System.out.println(Arrays.toString(j));
				}
				System.out.println();
			} else {
				if (i == 1) {
					System.out.println("in");
					answer[index - 1] = previousIndex;
//					System.out.println();
				}
				answer[index] = intervals[i];
				previousIndex = answer[index];
				index++;
			}
			for (int[] j : answer) {
				System.out.println(Arrays.toString(j));
			}
//			System.out.println("    last "+Arrays.toString(intervals[i]));
			System.out.println();

		}
		System.out.println(index);
		int[][] result = new int[index][2];
		for (int i = 0; i < index; i++) {
			result[i] = answer[i];
		}

//		for (int[] i : answer) {
//			System.out.println(Arrays.toString(i));
//		}

		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		int[][] intervals = { { 5, 7 }, { 1, 4 }, { 6, 8 }, { 2, 5 }, { 9, 10 } };
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
//		int[][] intervals = { { 1,4 },{4,5} };
//		int[][] intervals = { { 1,4},{5,6} };
//		int[][] intervals = { { 2,3 }, { 2,2 }, { 3,3 }, { 1,3 }, { 5,7},{2,2 },{4,6}};

		int[][] result = new MergeIntervals().mergeUsingList(intervals);
		for (int[] i : result) {
			System.out.println(Arrays.toString(i));
		}

	}

	public int[][] mergeV2(int[][] intervals) {

		Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
		int[] previousNode = intervals[0];
		int[][] answer = new int[intervals.length][2];
		int index =1;
//		System.out.println(Arrays.toString(previousNode));
		
		for (int i = 1; i < intervals.length; i++) {
			if(previousNode[1]>= intervals[i][0]) {
//				System.out.println(Arrays.toString(intervals[i]));
				answer[index - 1] = new int[] {previousNode[0],Math.max(previousNode[1], intervals[i][1])};
//				System.out.println(" here "+Arrays.toString(answer[0]));
				previousNode = answer[index - 1];
			}else {
				if(i == 1) {
					answer[index-1] = previousNode;
				}
				
				answer[index] = intervals[i];
				index++;
			}
			
		}
		
		int[][] result = new int[index][2];
		for(int i = 0;i<index;i++) {
			result[i] = answer[i];
		}

		
		return result;

	}
	
	
	
	
	
	
	public int[][] mergeUsingList(int[][] intervals){
		Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
		List<int[]> merged = new ArrayList<>();
		
		for(int[] i:intervals) {
			if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < i[0]) {
				merged.add(i);
			}else {
				merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], i[1]);
			}
		}
		return merged.toArray(new int[merged.size()][2]);
		
	}
}
