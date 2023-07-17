package Exercise_145;

public class Solution {
	public static int minDeletionSize(String[] strs) {
		int column = strs[0].length();
		int count = 0;
		for (int col = 0; col < column; col++) {
			for (int row = 1; row < strs.length; row++) {
				if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] strs = { "abc", "bce", "cae" };
		System.out.println(minDeletionSize(strs));
	}
}
