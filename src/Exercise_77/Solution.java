package Exercise_77;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
	public static int longestPalindrome(String s) {

		Set<Character> oddChars = new HashSet<>();
		
		for (Character c : s.toCharArray()) {
			if (oddChars.contains(c)) {
				oddChars.remove(c);
			} else {
				oddChars.add(c);
			}
		}
		
		if (oddChars.size() != 0) {
			return s.length() - oddChars.size() + 1;
		} else {
			return s.length();
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("abccccdd"));
	}
}
