package Exercise_125;

public class Solution {
	public static int rangeSumBST(TreeNode root, int low, int high) {
		int sum = 0;
		if (root == null) {
			return 0;
		}
		
		if (root.val >= low && root.val <= high) {
			sum += root.val;
		}
		
		if (root.val > low) {
			sum += rangeSumBST(root.left, low, high);
		}
		
		if (root.val < high) {
			sum += rangeSumBST(root.right, low, high);
		}

		return sum;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		
		root.right = new TreeNode(15);
		root.right.right = new TreeNode(18);
		
		System.out.println(rangeSumBST(root, 7, 15));
	}
}
