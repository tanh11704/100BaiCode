package Exercise_2;

import java.util.ArrayList;
import java.util.Vector;

public class Solution {
	final static String[] MORSE_CODE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	public static int uniqueMorseRepresentations(String[] words) {
		Vector<String> vector = new Vector<String>();
		for (int i = 0; i < words.length; i++) {
			String msg = "";
			char[] chars = words[i].toCharArray();
			for (int j = 0; j < chars.length; j++) {
				msg += MORSE_CODE[(int)(chars[j]) - 97];
			}
			vector.add(msg);
		}
		for (int i = 0; i < vector.size(); i++) {
			for (int j = vector.size() - 1; j >= i+1; j--) {
				if (vector.elementAt(j).equals(vector.elementAt(i))) {
					vector.remove(j);
				}
			}
		}
		System.out.println(vector);
		return vector.size();
	}

	public static void main(String[] args) {
		String[] text = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
		System.out.println(uniqueMorseRepresentations(text));
	}

}
