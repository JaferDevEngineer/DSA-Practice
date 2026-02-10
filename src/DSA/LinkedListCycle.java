package DSA;

public class LinkedListCycle {
	public static void main(String[] args) {
//		ListNode list = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(0);
		ListNode node4 = new ListNode(-4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		// pos = 1 → tail connects to node2
		node4.next = node2;
		System.out.println(itHasCycle(node1));
//		check(node1);		
	}

	private static boolean itHasCycle(ListNode listNode) { //3 2 0 -4
		
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
