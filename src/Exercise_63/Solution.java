package Exercise_63;

public class Solution {
	
	public static boolean checkCharacterNoReplace(int i, String s) {
		
		for (int j = 0; j < s.length(); j++) {
			if (i != j) {
				if (s.charAt(j) == s.charAt(i)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int firstUniqChar(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			if (checkCharacterNoReplace(i, s)) {
				return i;
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
}
