package Exercise_23;

public class Solution {

	public static int[][] transpose(int[][] matrix) {

		int row = matrix.length;
		int col = matrix[0].length;

		int[][] newMatrix = new int[col][row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				newMatrix[j][i] = matrix[i][j];
			}
		}

		return newMatrix;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] newMatrix = transpose(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
