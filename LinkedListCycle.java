package DSA;

public class LinkedListCycle {
	public static void main(String[] args) {
//		ListNode list = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
		System.out.println(itHasCycle(new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))))));
	}

	private static boolean itHasCycle(ListNode listNode) {
		
		ListNode fast = listNode;
		ListNode slow = listNode;
		
		while(fast!=null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow)
				return true;
		}
		return false;
	}

}
