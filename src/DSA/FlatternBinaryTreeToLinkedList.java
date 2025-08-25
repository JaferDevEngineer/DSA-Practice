package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlatternBinaryTreeToLinkedList {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
				new TreeNode(5, null, new TreeNode(6)));
		new FlatternBinaryTreeToLinkedList().flattenV2(root);
//		new FlatternBinaryTreeToLinkedList().printTree(root);
		
		
//		System.out.println(root);
	}

//			    1
//			   / \
//			  2   5
//			 / \   \
//			3   4   6

	public void flatten(TreeNode root) {
		TreeNode curr = root;

		while (curr != null) {
			if (curr.left != null) {
				// Find rightmost node of left subtree
				TreeNode rightmost = curr.left;
				System.out.println(rightmost.val);
				while (rightmost.right != null) {
					rightmost = rightmost.right;
					System.out.println(" inWhile " + rightmost.val);
				}

				System.out.println("after While " + rightmost);

				// Attach original right subtree to rightmost
				rightmost.right = curr.right;

				// Move left subtree to right

				curr.right = curr.left;
				curr.left = null;
			}
			// Move to next node
			curr = curr.right;
		}
	}
	
//						    1
//						   / \
//						  2   5
//						 / \   \
//						3   4   6
	private void flattenV2(TreeNode root) {
		System.out.println("base");
		printTree(root);
		TreeNode curr = root;
		while(curr!=null) {
			
			if(curr.left!=null) {
//			System.out.println("current "+curr);
//			System.out.println();
//			System.out.println(" left "+ curr.left);
//			System.out.println();
			
			TreeNode rightmost = curr.left;
			
			while(rightmost.right != null) {
				rightmost = rightmost.right;
			}
			rightmost.right = curr.right;
			printTree(root);

			curr.right = curr.left;
			curr.left = null;
			
			}			
			curr = curr.right;
		}
		printTree(root);
	}
	public void printTree(TreeNode root, String prefix, boolean isLeft) {
	    if (root != null) {
	        System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.val);
	        printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
	        printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
	    }
	}
	public void printInOrder(TreeNode root) {
	    if (root == null) return;
	    printInOrder(root.left);
	    System.out.print(root.val + " ");
	    printInOrder(root.right);
	}
	public void printTree(TreeNode root) {
	    int maxLevel = getHeight(root);
	    printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
	    if (nodes.isEmpty() || allElementsNull(nodes)) return;

	    int floor = maxLevel - level;
	    int edgeLines = (int) Math.pow(2, Math.max(floor - 1, 0));
	    int firstSpaces = (int) Math.pow(2, floor) - 1;
	    int betweenSpaces = (int) Math.pow(2, floor + 1) - 1;

	    printWhitespaces(firstSpaces);

	    List<TreeNode> newNodes = new ArrayList<>();
	    for (TreeNode node : nodes) {
	        if (node != null) {
	            System.out.print(node.val);
	            newNodes.add(node.left);
	            newNodes.add(node.right);
	        } else {
	            System.out.print(" ");
	            newNodes.add(null);
	            newNodes.add(null);
	        }
	        printWhitespaces(betweenSpaces);
	    }
	    System.out.println();

	    for (int i = 1; i <= edgeLines; i++) {
	        for (int j = 0; j < nodes.size(); j++) {
	            printWhitespaces(firstSpaces - i);
	            if (nodes.get(j) == null) {
	                printWhitespaces(edgeLines + edgeLines + i + 1);
	                continue;
	            }

	            if (nodes.get(j).left != null) System.out.print("/");
	            else printWhitespaces(1);

	            printWhitespaces(i + i - 1);

	            if (nodes.get(j).right != null) System.out.print("\\");
	            else printWhitespaces(1);

	            printWhitespaces(edgeLines + edgeLines - i);
	        }
	        System.out.println();
	    }

	    printNodeInternal(newNodes, level + 1, maxLevel);
	}

	private void printWhitespaces(int count) {
	    for (int i = 0; i < count; i++) System.out.print(" ");
	}

	private boolean allElementsNull(List<TreeNode> list) {
	    for (Object obj : list) if (obj != null) return false;
	    return true;
	}

	private int getHeight(TreeNode root) {
	    if (root == null) return 0;
	    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

}
