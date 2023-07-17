package Exercise_12;

public class Solution {
	public static String reverseWords(String s) {
		String result = "";
		String[] arr_s = s.split(" ");
		for (int i = 0; i < arr_s.length; i++) {
			if (i == arr_s.length - 1) {
				result += new StringBuilder(arr_s[i]).reverse().toString();
			} else {
				result += new StringBuilder(arr_s[i]).reverse().toString() + " ";
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
}
