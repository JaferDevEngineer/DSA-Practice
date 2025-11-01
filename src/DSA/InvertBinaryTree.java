package DSA;

public class InvertBinaryTree {
	public static void main(String[] args) {
		TreeNode node = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
				new TreeNode(7, new TreeNode(6), new TreeNode(9)));
		
		System.out.println(invertTreeV2(node));
	}

	private static Object invertTreeV2(TreeNode node) {
		
		if(node ==null) return null;
		
		TreeNode tempNode = node.left;
		node.left = node.right;
		node.right = tempNode;
		
		invertTreeV2(node.left);
		invertTreeV2(node.right);
		return node;
	}

//	public static TreeNode invertTree(TreeNode root) {
//
//		if (root == null)
//			return null;
//		System.out.println(root);
//		TreeNode temp = root.left;
//		root.left = root.right;
//		root.right = temp;
//
//		invertTree(root.left);
//		invertTree(root.right);
//		return root;
//	}
	
	
	public TreeNode invertNode(TreeNode treeNode) {
		if(treeNode == null)
			return null;
		TreeNode temp = treeNode.left;
		treeNode.left = treeNode.right;
		treeNode.right = temp;
		
		invertNode(treeNode.left);
		invertNode(treeNode.right);
		
		return treeNode;
	}

}
