package DSA;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		
		System.out.println(reverseLinkedList(list));
	}

	private static ListNode reverseLinkedList(ListNode list) {
		ListNode reversedList = null;
		while(list!= null) {
			ListNode temp = reversedList; // 2-> 1-> null
			 reversedList = new ListNode(list.val); //2 
			 reversedList.next = temp;// 2-> 1
			
			list = list.next;
		}
		return reversedList;
	}

	public String reverseLinkedNodeList(ListNode listNode) {
		// TODO Auto-generated method stub
		return null;
	}
}
