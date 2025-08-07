package DSA;

public class isSymmetric {
	
	public static void main(String[] args) {
		TreeNode root =  new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		System.out.println(new isSymmetric().isSymmetric(root));
	}

	public boolean isSymmetric(TreeNode tree) {
		
		if(tree == null) return true;
		return isMirror(tree.left,tree.right);
	}

	private boolean isMirror(TreeNode left, TreeNode right) {
		if(left == null && right == null) return true;
		if(left == null || right == null) return false;
		if(left.val != right.val) return false;
		return isMirror(left.left, right.right) && isMirror(left.right, right.left);
	}
}
