package DSA;

import java.util.ArrayList;
import java.util.List;

public class MiddleNode {
	public static void main(String[] args) {
		System.out.println(middleNodeV2(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5, 
//				new ListNode(6)
				null
				)))))));
	}

	private static ListNode middleNode(ListNode listNode) {
		List<ListNode> list = new ArrayList<>();
		
		while(listNode != null) {
			list.add(listNode);
			listNode = listNode.next;
		}
		int listSize =  list.size()-1;
		int size = listSize%2 == 0?listSize/2:(listSize+1)/2;
		return list.get(size);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static ListNode middleNodeV2(ListNode listNode) { // 1 2 3 4 5 6
		ListNode fast = listNode;
		ListNode slow = listNode;
		while(fast!=null && fast.next!= null) {
			fast =fast.next.next;
			slow = slow.next;
			
		}
		return slow;
	}
}
