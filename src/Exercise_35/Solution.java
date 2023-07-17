package Exercise_35;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static TreeNode invertTree(TreeNode root) {
		
		if (root == null) {
			return null;
		}
		
		if (root.left == null && root.right == null) {
			return root;
		}
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invertTree(root.left);
		invertTree(root.right);
		
		return root;
	}
	
	public static void printTree(TreeNode root) {
		if (root == null) {
	        return;
	    }

	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.add(root);

	    while (!queue.isEmpty()) {
	        int levelSize = queue.size();
	        for (int i = 0; i < levelSize; i++) {
	            TreeNode node = queue.poll();
	            System.out.print(node.val + " ");

	            if (node.left != null) {
	                queue.add(node.left);
	            }
	            if (node.right != null) {
	                queue.add(node.right);
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		
		invertTree(root);
		printTree(root);
	}
}
