package Exercise_5;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		
		if (root1 == null && root2 == null) {
			return null;
		}

		if (root1 == null) {
			return root2;
		}
		if (root2 == null) {
			return root1;
		}
		
		root1.val += root2.val;
		root1.left = mergeTrees(root1.left, root2.left);
		root1.right = mergeTrees(root1.right, root2.right);
		
		return root1;
	}
	
	public static void printLevelOrder(TreeNode root) {
	       Queue<TreeNode> queue = new LinkedList<TreeNode>();
	       queue.add(root);
	       while (!queue.isEmpty()) {
	           TreeNode temp = queue.poll();
	           System.out.print(temp.val + " ");

	           if (temp.left != null) {
	               queue.add(temp.left);
	           }

	           if (temp.right != null) {
	               queue.add(temp.right);
	           }
	       }
	   }
	
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(3);
		root1.left.left = new TreeNode(5);
		root1.right = new TreeNode(2);
		
		
		TreeNode root2 = new TreeNode(2);
		root2.left = new TreeNode(1);
		root2.left.right = new TreeNode(4);
		
		root2.right = new TreeNode(3);
		root2.right.right = new TreeNode(7);
		
		
		root1 = mergeTrees(root1, root2);
		printLevelOrder(root1);
	}
}
