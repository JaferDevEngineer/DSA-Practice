package DSA;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		System.out.println(reverseLinkedList(list));
	}

	private static ListNode reverseLinkedList(ListNode list) {
		ListNode reversedList = null;
		while(list!= null) {
			ListNode temp = reversedList;
			 reversedList = new ListNode(list.val);
			 reversedList.next = temp;
			 
			list = list.next;
		}
		return reversedList;
	}
}
