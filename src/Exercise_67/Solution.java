package Exercise_67;

import java.util.Arrays;

public class Solution {
	public static boolean isAnagram(String s, String t) {
		
		if (s.length() != t.length()) {
			return false;
		} else {
			
			char[] sArray = s.toCharArray();
			char[] tArray = t.toCharArray();
			
			Arrays.sort(sArray);
			Arrays.sort(tArray);
			
			return Arrays.equals(sArray, tArray);
		}
		
	}
	
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		
		System.out.println(isAnagram(s, t));
	}
}
