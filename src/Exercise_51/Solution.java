package Exercise_51;

public class Solution {
	public static int[] constructRectangle(int area) {
		
		int width = (int) Math.sqrt(area);

		int length = area / 2;
		
		while (area % width != 0) {
			width--;
		}
		
		length = area / width;
		
		return new int[] {length, width};
	}
	
	public static void main(String[] args) {
		int[] result = constructRectangle(122122);
		System.out.println(result[0]);
	}
}
