package DSA;

import java.util.Arrays;

public class ValidateBinarySearch {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		System.out.println(new ValidateBinarySearch().isValidBST(root));

//		String s1 = "b", s2 = "abc";
//		String s1 = "ace", s2 = "abcde";
//		System.out.println("heii " + new ValidateBinarySearch().subSequent(s1, s2));
	}

//	private boolean subSequent(String s1, String s2) { // String s1 = "ace", s2 = "abcde";
//
////		if(s1)
//		char[] s2Array = s2.toCharArray();
//		char[] s1Array = s1.toCharArray();
//
//		int j = 0, count = 0;
//
//		for (int i = 0; i < s2Array.length; i++) {
//
//			while ( j < s1Array.length && s2Array[i] == s1Array[j]) {
//				j++;
//				count++;
//				break;
//			}
//		}
//		return s1Array.length == count;
//
//	}

	
//    5 // max min
//   / \
//  4   6 // max 5
//     / \
//    3   7
	public boolean isValidBST(TreeNode root) {
	    return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean validate(TreeNode node, long min, long max) { // 6 , 5, max // 
	    if (node == null) return true;

	    if (node.val <= min || node.val >= max) return false;

	    return validate(node.left, min, node.val) &&
	           validate(node.right, node.val, max);
	}
	
	
	
	private boolean isValidBst(TreeNode root) {
		
		return validateBinarySearch(root,root!=null?root.val:0);
	}
	
	private boolean validateBinarySearch(TreeNode root, int head) {
		
		if(root==null)
			return true;
		
//		if (root.left != null && h)
//			if (root.val < root.left.val)
//				return false;
		if (root.right != null)
			if (root.val > root.right.val)
				return false;

		return validateBinarySearch(root.left,head) && validateBinarySearch(root.right,head) ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private boolean validateBinarySearchV2(TreeNode root) {
		return validateCheck(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private boolean validateCheck(TreeNode root, int minValue, int maxValue) {
		if(root == null) return true;
//		if()
		return false;
	}
	
	

}
