package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BinaryTreeZigzagLevelOrderTraversel {
	public static void main(String[] args) {
		System.out.println(new BinaryTreeZigzagLevelOrderTraversel().binaryTreeZigzagLevelOrderTraversel(
				new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
//		System.out.println(
//				new BinaryTreeZigzagLevelOrderTraversel().binaryTreeZigzagLevelOrderTraversel(new TreeNode(1)));
//		System.out.println(new BinaryTreeZigzagLevelOrderTraversel()
//				.binaryTreeZigzagLevelOrderTraversel(new TreeNode(1, new TreeNode(2), null)));
//		System.out.println(new BinaryTreeZigzagLevelOrderTraversel().binaryTreeZigzagLevelOrderTraversel(
//				new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3))));

//		TreeNode root = new TreeNode(0, new TreeNode(2, new TreeNode(1, new TreeNode(5), new TreeNode(1)), null),
//				new TreeNode(4, new TreeNode(3, new TreeNode(6), null), new TreeNode(-1, new TreeNode(8), null)));
//		System.out.println(new BinaryTreeZigzagLevelOrderTraversel().binaryTreeZigzagLevelOrderTraversel(root));
	}

	private List<List<Integer>> binaryTreeZigzagLevelOrderTraversel(TreeNode treeNode) {
		if(treeNode == null)
            return new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		map.put(1, Arrays.asList(treeNode.val));

		validateV2(treeNode, map, 2);
//		List<List<Integer>> list = new ArrayList<>();
//		for(int i = 1;i<=map.size();i++) {
//			if(i % 2 != 0) {
//				list.add(map.get(i));
//			}else {
//				List<Integer> l = map.get(i);
//				Collections.reverse(l);
//				list.add(l);
//			}
//			
//		}
//		;
		return  new ArrayList<>(map.values());
	}

	private void validate(TreeNode treeNode, Map<Integer, List<Integer>> map, int level, boolean order) {

		List<Integer> l = new ArrayList<>();

//		if (order) {
//			if (treeNode.right != null)
//				l.add(treeNode.right.val);
//			if (treeNode.left != null)
//				l.add(treeNode.left.val);

//		} else {

		if (treeNode.left != null)
			l.add(treeNode.left.val);
		if (treeNode.right != null)
			l.add(treeNode.right.val);
//		}
		if (l.size() > 0) {
			List<Integer> existLevel = map.getOrDefault(level, new ArrayList<>());
			System.out.println("existlevel " + level + " " + existLevel);

			existLevel.addAll(l);

			map.put(level, existLevel);
			System.out.println("updated " + existLevel);
		}
		level++;
		if (treeNode.left != null)
			validate(treeNode.left, map, level, !order);
		if (treeNode.right != null)
			validate(treeNode.right, map, level, !order);
	}

	private void validateV2(TreeNode treeNode, Map<Integer, List<Integer>> map, int level) {

		List<Integer> l = new ArrayList<>();

		if (treeNode.left != null)
			l.add(treeNode.left.val);
		if (treeNode.right != null)
			l.add(treeNode.right.val);
		if (l.size() > 0) {
			List<Integer> existLevel = map.getOrDefault(level, new ArrayList<>());
			System.out.println("existlevel " + level + " " + existLevel);

			existLevel.addAll(l);

			map.put(level, existLevel);
			System.out.println("updated " + existLevel);
		}
		level++;
		if (treeNode.left != null)
			validateV2(treeNode.left, map, level);
		if (treeNode.right != null)
			validateV2(treeNode.right, map, level);
	}

//	private void validate(TreeNode treeNode, List<List<Integer>> list,boolean order) {
//
//		List<Integer> l = new ArrayList<>();
//		
//		if(order) {
//			if (treeNode.right != null) 
//				l.add(treeNode.right.val);
//			if (treeNode.left != null)
//				l.add(treeNode.left.val);
//		}else {
//			
//			if (treeNode.left != null)
//				l.add(treeNode.left.val);
//			if (treeNode.right != null) 
//				l.add(treeNode.right.val);
//		}
//			
//		if (l.size() > 0) {
//			list.add(l);
//		}
//
//		if (treeNode.left != null)
//			validate(treeNode.left, list,!order);
//		if (treeNode.right != null)
//			validate(treeNode.right, list,!order);
//	}
}
