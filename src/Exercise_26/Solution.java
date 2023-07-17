package Exercise_26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public static List<Double> averageOfLevels(TreeNode root) {
	    List<Double> result = new ArrayList<>();
	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.offer(root);
	    while (!queue.isEmpty()) {
	        int levelSize = queue.size();
	        double levelSum = 0;
	        for (int i = 0; i < levelSize; i++) {
	            TreeNode node = queue.poll();
	            levelSum += node.val;
	            if (node.left != null) {
	                queue.offer(node.left);
	            }
	            if (node.right != null) {
	                queue.offer(node.right);
	            }
	        }
	        double levelAvg = levelSum / levelSize;
	        result.add(levelAvg);
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(averageOfLevels(root));
	}
}
