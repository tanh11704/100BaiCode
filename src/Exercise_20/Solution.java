package Exercise_20;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int oldCol = mat[0].length;
		int oldRow = mat.length;

		if (oldCol * oldRow == r * c) {
			List<Integer> matrix = new ArrayList<>();

			for (int i = 0; i < oldRow; i++) {
				for (int j = 0; j < oldCol; j++) {
					matrix.add(mat[i][j]);
				}
			}

			int k = 0;
			int[][] result = new int[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					result[i][j] = matrix.get(k);
					k++;
				}
			}

			return result;
		} else {
			return mat;
		}
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2 }, { 3, 4 } };

		int matrix[][] = matrixReshape(mat, 1, 4);
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
