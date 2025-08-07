package DSA;

public class MergeSortedLists {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// Create a dummy node to simplify the logic
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;

		// Traverse both lists
		while (list1 != null && list2 != null) {

			System.out.println("list1");
			printList(list1);
			System.out.println();

			System.out.println("list2");
			printList(list2);
			System.out.println();

			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}

			System.out.println("every dummy");
			printList(dummy);
			System.out.println();
			System.out.println("before");
			printList(current);
			current = current.next;

			System.out.println("after");
			printList(current);
			System.out.println();
		}

		// Append any remaining nodes from either list
		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		System.out.println("dummy");
		printList(dummy);
		System.out.println();
		System.out.println("last ");
		printList(current);
		// Return the merged list (skipping the dummy node)
		return dummy.next;
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Example 1: list1 = [1,2,4], list2 = [1,3,4]
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

//	        ListNode dummy = new ListNode(-1);
//	        dummy.next = list1;
//	        printList(dummy.next);
		ListNode mergedList = mergeTwoListsV3(list1, list2);
		printList(mergedList); // Output: 1 1 2 3 4 4

//	        // Example 2: list1 = [], list2 = []
//	        list1 = null;
//	        list2 = null;
//	        mergedList = mergeTwoLists(list1, list2);
//	        printList(mergedList); // Output: (empty)
//
//	        // Example 3: list1 = [], list2 = [0]
//	        list1 = null;
//	        list2 = new ListNode(0);
//	        mergedList = mergeTwoLists(list1, list2);
//	        printList(mergedList); // Output: 0
	}

	public static ListNode mergeTwoListsV2(ListNode list1, ListNode list2) {

		ListNode current = new ListNode(-1);
		ListNode dummy = current;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		if (list1 != null)
			current.next = list1;

		if (list2 != null)
			current.next = list2;

		return dummy.next;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static ListNode mergeTwoListsV3(ListNode list1, ListNode list2) {

		ListNode newList = new ListNode(-1);
		ListNode firstNode = newList;
		while (list1 != null && list2 != null) {

			if (list1.val < list2.val) {
				newList.next = new ListNode(list1.val);
				list1 = list1.next;
			} else {
				newList.next = new ListNode(list2.val);
				list2 = list2.next;
			}
			newList = newList.next;
			
		}
		if(list1!= null ) {
			newList.next = list1;
		}
		if(list2!= null ) {
			newList.next = list2;
		}
		return firstNode.next;
	}
}
