package Exercise_43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public static char findTheDifference(String s, String t) {
		
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < t.length(); i++) {
			list.add(t.charAt(i));
		}
		
		for (int i = 0; i < s.length(); i++) {
			list.remove(Character.valueOf(s.charAt(i)));
		}
		
		return list.get(0);
	}
	
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}
}
