package Exercise_135;

public class Solution {
	public static int countSegments(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countSegments("Hello, my name is John"));
	}
}
