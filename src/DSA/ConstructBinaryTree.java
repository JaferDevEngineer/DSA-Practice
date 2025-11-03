package DSA;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTree {
	// A hashmap to store value -> index mapping for inorder array
	private Map<Integer, Integer> inorderIndexMap = new HashMap<>();

	// Index pointer for preorder traversal
	private int preIndex = 0;

	private TreeNode buildTree(int[] preOrder, int[] inOrder) {

		for (int i = 0; i < inOrder.length; i++) {
			inorderIndexMap.put(inOrder[i], i);
		}
		return build(preOrder, 0, inOrder.length - 1);

	}

	private TreeNode build(int[] preOrder, int start, int end) {


		if (start > end)
			return null;

		int rootValue = preOrder[preIndex++];
		TreeNode tree = new TreeNode(rootValue);
		int inIndexValue = inorderIndexMap.get(rootValue);

		tree.left = build(preOrder, start, inIndexValue - 1);
		tree.right = build(preOrder, inIndexValue + 1, end);
		return tree;
	}

	public static void main(String[] args) {
		int[] preOrder = { 3, 9, 20, 15, 7 };
		int[] inOrder = { 9, 3, 15, 20, 7 };
		System.out.println(new ConstructBinaryTreefromPreorderandInorderTraversal().buildTree(preOrder, inOrder));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public TreeNode buildTree1(int[] preorder, int[] inorder) {
		
		for(int i = 0;i<inorder.length;i++) {
			inorderIndexMap.put(inorder[i], i);
		}
		
		
		return buildSub(preorder,0, preorder.length -1 );

	}

	private TreeNode buildSub(int[] preorder, int start, int end) {
		
		
//		int[] preOrder = { 3, 9, 20, 15, 7 };
//		int[] inOrder = { 9, 3, 15, 20, 7 };
		
		if(start>end)
			return null;
		
		int root = preorder[preIndex++];
		TreeNode tree = new TreeNode(root);
		int indexOfInOrder = inorderIndexMap.get(root);
		
		tree.left = buildSub(preorder, start, indexOfInOrder - 1);
		tree.right = buildSub(preorder, indexOfInOrder + 1, end);
		
		return tree;
	}

}