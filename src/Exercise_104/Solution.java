package Exercise_104;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static String reverseOnlyLetters(String s) {
		
		List<Character> characters = new ArrayList<>();
		String output = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				characters.add(s.charAt(i));
			}
		}
		
		int index = characters.size() - 1;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				output += characters.get(index);
				index--;
			} else {
				output += s.charAt(i);
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}
}
