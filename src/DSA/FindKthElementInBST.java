package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKthElementInBST {

	public static void main(String[] args) {
		
//		System.out.println(new FindKthElementInBST().findKthElementInBST(new TreeNode(3,new TreeNode(1,new TreeNode(2),new TreeNode()),new TreeNode(4))));
		System.out.println();
		TreeNode tree= new TreeNode(3,new TreeNode(1,null,new TreeNode(2)),new TreeNode(4));
		
		System.out.println(new FindKthElementInBST().kthSmallestV2(tree,1));
	}
	public int kthSmallest(TreeNode root, int k) {
	    List<Integer> inorder = new ArrayList<>();
	    inorderTraversal(root, inorder);
	    return inorder.get(k - 1);
	}

//	   3
//    / \
//   1   4
//    \
//     2
	private void inorderTraversal(TreeNode node, List<Integer> list) {
	    if (node == null) return;
	    inorderTraversal(node.left, list);
	    list.add(node.val);
	    inorderTraversal(node.right, list);
	}

	private int findKthElementInBST(TreeNode treeNode) {
		int[] arr = new int[256];
		
		
		if(treeNode != null) {
			arr[treeNode.val] = 1;
			if(treeNode.left !=null )
				validate(treeNode.left,arr);
			if(treeNode.right !=null )
				validate(treeNode.right,arr);
			
		}
		
		return 0;
	}

	private void validate(TreeNode node, int[] arr) {
		
		if(node.val != 0) {
			arr[node.val] = 1;
			System.out.println(node.val);
		}
		
		if(node.left !=null )
			validate(node.left,arr);
		if(node.right !=null )
			validate(node.right,arr);
		
	}
	
	
	
	
	
	 public int kthSmallestV2(TreeNode root, int k) {
		 List<Integer> list = new ArrayList<>();
		 inOrderTraversal(root,list);
		return list.get(k-1);
	        
	    }
	private void inOrderTraversal(TreeNode root, List<Integer> list) {
		if(root == null) return;
		
		inOrderTraversal(root.left, list);
		list.add(root.val);
		inOrderTraversal(root.right, list);
		
		
	}
	
	
	
	
	
	
}
