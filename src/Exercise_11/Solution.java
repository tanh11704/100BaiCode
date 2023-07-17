package Exercise_11;

import java.util.Iterator;

public class Solution {
	public static int[][] flipAndInvertImage(int[][] image) {
		int[][] result = null;
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length / 2; j++) {
				int tam = image[i][j];
				image[i][j] = image[i][image[0].length - 1 - j];
				image[i][image[0].length - 1 - j] = tam;
			}
		}
		
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				if (image[i][j] == 1) {
					image[i][j] = 0;
				} else {
					image[i][j] = 1;
				}
			}
		}
		return image;
	} 
	
	public static void main(String[] args) {
		int[][] image = {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};
//		System.out.println(flipAndInvertImage(image));
		int[][] result = flipAndInvertImage(image);
		int row = result.length;
		int col = result[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
