package Exercise_34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public static String[] uncommonFromSentences(String s1, String s2) {
		String[] splitS1 = s1.split(" "), splitS2 = s2.split(" ");

		List<String> result = new ArrayList<>();

		for (int i = 0; i < splitS1.length; i++) {
			if (checkWordOutArray(splitS1[i], splitS2) && checkWordInArray(splitS1, i)) {
				result.add( splitS1[i]);
				
			}
		}

		for (int i = 0; i < splitS2.length; i++) {
			if (checkWordOutArray(splitS2[i], splitS1) && checkWordInArray(splitS2, i)) {
				result.add( splitS2[i]);
			}
		}
		
		return result.toArray(new String[0]);
	}

	public static boolean checkWordOutArray(String word, String[] s) {
		for (int i = 0; i < s.length; i++) {
			if (word.equals(s[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkWordInArray(String[] s, int index) {
		for (int i = 0; i < s.length; i++) {
			if (i != index) {
				if (s[index].equals(s[i])) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "apple apple", s2 = "banana";

		String[] result = uncommonFromSentences(s1,s2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
