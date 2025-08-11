package DSA;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

	public static void main(String[] args) {

	}

	public static void main(String[] args) {
		
		
	}
	public static void main(String[] args) {
		
	}
	public static void main(String[] args) {
		ConstructBinaryTreefromPreorderandInorderTraversal sol = new ConstructBinaryTreefromPreorderandInorderTraversal();
		int[] preorder = { 3, 9, 20, 15, 7 };
		int[] inorder = { 9, 3, 15, 20, 7 };

		TreeNode root = sol.buildTree(preorder, inorder);

		System.out.print("Inorder of constructed tree: ");
		sol.printInorder(root); // should print: 9 3 15 20 7
	}

	private void constructBinaryTreefromPreorderandInorderTraversal(int[] preOrder, int[] inOrder) {

		TreeNode root = new TreeNode(preOrder[0]);
		int inOrderRoot = -1;
		for (int i = 0; i < inOrder.length; i++) {
			if (preOrder[0] == inOrder[i])
				inOrderRoot = i;
		}
		System.out.println("inOrder " + inOrderRoot + " preOrder " + preOrder[0]);

	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		// Step 1: Build a hashmap to quickly find root index in inorder array
		Map<Integer, Integer> inMap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			inMap.put(inorder[i], i);
		}

		// Step 2: Start recursive construction
		return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
	}

	private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
			Map<Integer, Integer> inMap) {
		// Base case: no elements to build the tree
		if (preStart > preEnd || inStart > inEnd) {
			return null;
		}

		// Step 3: The first element in preorder is the root
		int rootVal = preorder[preStart];
		TreeNode root = new TreeNode(rootVal);

		// Step 4: Get root index from inorder using hashmap
		int inRoot = inMap.get(rootVal);
		int numsLeft = inRoot - inStart; // number of elements in left subtree

		// Step 5: Recursively build left and right subtrees
		root.left = buildTreeHelper(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);

		root.right = buildTreeHelper(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

		return root;
	}

	// Optional: Function to print tree inorder (for testing)
	public void printInorder(TreeNode node) {
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.val + " ");
		printInorder(node.right);
	}

}
