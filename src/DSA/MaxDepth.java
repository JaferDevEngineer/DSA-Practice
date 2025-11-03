package DSA;

public class MaxDepth {
	public static void main(String[] args) {
//		TreeNode tree  = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(maxDepthV2(new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, new TreeNode(0), new TreeNode(0)), new TreeNode(7)))));
	}

	private static int maxDepth(TreeNode treeNode) {
//		    3
//		   / \
//		   9  20 
//		      / \
//		     15  7
		if (treeNode == null)
			return 0;

		int left = maxDepth(treeNode.left); // 1
		int right = maxDepth(treeNode.right); //
		return 1 + Math.max(left, right);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//    3
//   / \
//   9  20 
//      / \
//     15  7
	public static int maxDepthV2(TreeNode node) {//3,9,20,null,null,15,7
		if(node == null)
			return 0;
		
		int left = maxDepthV2(node.left);
		int right = maxDepthV2(node.right);
		return 1+Math.max(left, right);
	}

}
