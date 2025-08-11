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
		int[] preOrder = {3,9,20,15,7};
		int[] inOrder = {9,3,15,20,7};
		System.out.println(new ConstructBinaryTreefromPreorderandInorderTraversal().buildTree(preOrder, inOrder));
 	}
}