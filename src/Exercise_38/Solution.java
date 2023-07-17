package Exercise_38;

public class Solution {

	public static boolean checkStringUpper(String word) {

		for (int i = 0; i < word.length(); i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	public static boolean checkStringLower(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean detectCapitalUse(String word) {
		
		if (checkStringUpper(word) || checkStringLower(word)) {
			return true;
		} else {
			if (Character.isUpperCase(word.charAt(0))) {
				for (int i = 1; i < word.length(); i++) {
					if (Character.isUpperCase(word.charAt(i))) {
						return false;
					}
				}
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("Usa"));
	}

}
