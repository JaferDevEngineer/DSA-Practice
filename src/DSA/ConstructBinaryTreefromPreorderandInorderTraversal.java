package DSA;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

	public static void main(String[] args) {
		new ConstructBinaryTreefromPreorderandInorderTraversal().constructBinaryTreefromPreorderandInorderTraversal(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
	}

	private void constructBinaryTreefromPreorderandInorderTraversal(int[] preOrder, int[] inOrder) {
		
		TreeNode root = new TreeNode(preOrder[0]);
		int inOrderRoot = -1;
		for(int i = 0;i<inOrder.length;i++) {
			if(preOrder[0] == inOrder[i])
				inOrderRoot = i;
		}
		System.out.println("inOrder "+inOrderRoot +" preOrder "+preOrder[0]);
		
	}
}
