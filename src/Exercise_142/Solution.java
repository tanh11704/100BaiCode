package Exercise_142;

public class Solution {
	public static boolean isPalindrome(int x) {
		
		if (x < 0) {
			return false;
		}
		
		String str = Integer.toString(x);
	    String reversedStr = new StringBuilder(str).reverse().toString();
	    return str.equals(reversedStr);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}
}
