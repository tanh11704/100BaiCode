package Exercise_45;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static boolean findTarget(TreeNode root, int k) {
		Set<Integer> set = new HashSet<>();
		return find(root, k, set);
	}

	public static boolean find(TreeNode node, int k, Set<Integer> set) {
		if (node == null) {
			return false;
		}
		if (set.contains(k - node.val)) {
			return true;
		}
		set.add(node.val);
		return find(node.left, k, set) || find(node.right, k, set);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);

		root.right = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		System.out.println(findTarget(root, 9));
	}
}
