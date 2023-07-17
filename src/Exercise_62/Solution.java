package Exercise_62;

import java.util.Arrays;

public class Solution {
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		for (int i = 0; i < s.length && count < g.length; i++) {
			if (s[i] >= g[count]) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		int[] g = { 10, 9, 8, 7 };
		int[] s = { 5, 6, 7, 8 };
		System.out.println(findContentChildren(g, s));
	}
}
