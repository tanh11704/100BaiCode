package Exercise_32;

public class Solution {
	public static int maxDepth(TreeNode root) {
		if (root == null) {
	        return 0;
	    } else {
	        int left = maxDepth(root.left);
	        int right = maxDepth(root.right);
	        System.out.println(left + " " + right);
	        return Math.max(left, right) + 1;
	    }
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println(maxDepth(root));
	}
}
