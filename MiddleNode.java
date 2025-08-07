package DSA;

import java.util.ArrayList;
import java.util.List;

public class MiddleNode {
	public static void main(String[] args) {
		System.out.println(middleNode(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5, new ListNode(6))))))));
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
}
