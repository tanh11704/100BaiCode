package Exercise_68;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static int getMinimumDifference(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		inorder(root, list);

		Collections.sort(list);

		int minDiff = 999999;
		for (int i = 1; i < list.size(); i++) {
			minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(i - 1)));
		}

		return minDiff;
	}

	public static void inorder(TreeNode node, List<Integer> list) {
		if (node == null) {
			return;
		}
		inorder(node.left, list);
		list.add(node.val);
		inorder(node.right, list);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(48);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(49);
		
		System.out.println(getMinimumDifference(root));
	}
}
