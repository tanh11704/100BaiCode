package Exercise_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static String[] findWords(String[] words) {
        Map<Character, Integer> keyboard = new HashMap<Character, Integer>();
        keyboard.put('q', 1);
        keyboard.put('w', 1);
        keyboard.put('e', 1);
        keyboard.put('r', 1);
        keyboard.put('t', 1);
        keyboard.put('y', 1);
        keyboard.put('u', 1);
        keyboard.put('i', 1);
        keyboard.put('o', 1);
        keyboard.put('p', 1);
        keyboard.put('a', 2);
        keyboard.put('s', 2);
        keyboard.put('d', 2);
        keyboard.put('f', 2);
        keyboard.put('g', 2);
        keyboard.put('h', 2);
        keyboard.put('j', 2);
        keyboard.put('k', 2);
        keyboard.put('l', 2);
        keyboard.put('z', 3);
        keyboard.put('x', 3);
        keyboard.put('c', 3);
        keyboard.put('v', 3);
        keyboard.put('b', 3);
        keyboard.put('n', 3);
        keyboard.put('m', 3);
        List<String> oneRowWords = new ArrayList<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            boolean canBeTypedOnOneRow = true;
            for (int i = 1; i < lowerWord.length(); i++) {
                if (keyboard.get(lowerWord.charAt(i)) != keyboard.get(lowerWord.charAt(i - 1))) {
                    canBeTypedOnOneRow = false;
                    break;
                }
            }
            if (canBeTypedOnOneRow) {
                oneRowWords.add(word);
            }
        }
        return oneRowWords.toArray(new String[oneRowWords.size()]);
    }
    
    public static void main(String[] args) {
    	String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    	String[] resultStrings = findWords(words);
		for (String string : resultStrings) {
			System.out.println(string);
		}
	}
}

