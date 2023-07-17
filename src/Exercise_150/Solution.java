package Exercise_150;

import java.util.Stack;

public class Solution {
	public static boolean isValid(String s) {
		Stack<Character> arr = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
				arr.push(s.charAt(i));
			} else {
				if (arr.empty()) {
                    return false;
                }
                if (s.charAt(i) == ')' && arr.peek() == '(') {
                	arr.pop();
                } else if (s.charAt(i) == '}' && arr.peek() == '{') {
                	arr.pop();
                } else if (s.charAt(i) == ']' && arr.peek() == '[') {
                	arr.pop();
                } else {
                    return false;
                }
			}
			
		}
		
		return arr.empty();
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}
}
