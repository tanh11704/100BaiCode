package Exercise_122;

public class Solution {
	public static boolean check(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u';
	}

	public static String reverseVowels(String s) {

		char[] ch = s.toCharArray();
		int left = 0, right = ch.length - 1;

		while (left <= right) {
			if (check(ch[left]) == false) {
				left++;
			} else if (check(ch[right]) == false) {
				right--;
			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}

		}

		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		System.out.println(reverseVowels("Hello"));
	}
}
