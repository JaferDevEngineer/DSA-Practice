package DSA;

import java.util.Iterator;
import java.util.PriorityQueue;

public class FindKthLargestElement {
	/**
	 * There are two ways to solve this
	 *  1) sort in o(n) and get the element k-1 
	 *  2)  Use PriorityQueue
	 */
	public static void main(String[] args) {
		System.out.println(new FindKthLargestElement().findKthLargestElement(new int[] {3,2,1,5,6,4},2));
	}

	private int findKthLargestElement(int[] nums, int target) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
			for(int n:nums) {
				queue.add(n);
				if(queue.size()>target) {
					queue.poll();
				}
			}
			return queue.peek();
		
	}
}
