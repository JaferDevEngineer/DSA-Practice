package DSA;

public class DiameterOfTree {
//	public static void main(String[] args) {
//		System.out.println(diameterOfTree(new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3) )));
//	}
//
//	private static int diameterOfTree(TreeNode treeNode) {
//		TreeNode left = treeNode.left;
//		TreeNode right = treeNode.right;
//		
//		if(left!=null) {
//			int[] lef = diameterOfTree(left);
//		}
//		if(right !=null) {
//			diameterOfTree(right);
//		}
//		
//		return new int[];
//	}
	
	   int diameter = 0;


	    public  int diameterOfBinaryTree(TreeNode root) {
	    	System.out.println("height "+height(root));
	        return diameter;
	    }

	    private  int height(TreeNode node) {
	    	
	        if (node == null) return 0;
	        System.out.println("node called "+node.val);
//	    		  1
//	 			 /  \       
//		        /    \
//		       2      3
//		      / \    / \
//		     4   5  6   7
	        
	        int left = height(node.left); 
	        int right = height(node.right);

	        // Update the maximum diameter
	        diameter = Math.max(diameter, left + right);
	        System.out.println("currentNode "+node.val+" diameter "+diameter +" left "+left +" right "+right);

	        // Return height of current node
	        return 1 + Math.max(left, right);
	    }

	    // Example usage
	    public static void main(String[] args) {
	        TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
//	        root.right = new TreeNode(3);
//	        root.left.left = new TreeNode(4);
//	        root.left.right = new TreeNode(5);
//	        root.right.left = new TreeNode(6);
//	        root.right.right = new TreeNode(7);
//	        root.left.left.left = new TreeNode(8);
//	        root.left.left.right = new TreeNode(9);
//	        TreeNode root = new TreeNode(10);
//	        root.left = new TreeNode(7);
//	        root.right = new TreeNode(99);
//	        root.left.left = new TreeNode(2);
//	        root.left.right = new TreeNode(8);
//	        root.left.left.left = new TreeNode(7);
//	        root.left.left.right = new TreeNode(16);

	        System.out.println("Diameter: " + diameterOfTree(root)); // Output: 3
	    }

		private static int diameterOfBinaryTreeV2(TreeNode root) {
			
			checkDepth(root);
			return diameter;
		}

		private static int checkDepth(TreeNode root) {
			if(root == null) return 0;
			
			int left = checkDepth(root.left);
			int right = checkDepth(root.right);
			
			diameter = Math.max(diameter,(left+right));
			
			return 1+ Math.max(left, right);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static int diameterOfTree(TreeNode node) {
	        if(node == null)
					return 0;
				checkTree(node);
				return diameter;
	    }
	    public static int checkTree(TreeNode tree){
	        if(tree == null)
					return 0;
				
				int left = checkTree(tree.left);

				int right =checkTree(tree.right);

	            diameter = Math.max(diameter,(left+right));
				return 1+Math.max(left, right);
	    }
}
