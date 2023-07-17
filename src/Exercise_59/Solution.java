package Exercise_59;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = 0;
		int prev = 0;
		for (int i = 0; i < s.length(); i++) {
			int curr = map.get(s.charAt(i));
			if (curr > prev) {
				result -= 2 * prev;
			}
			result += curr;
			prev = curr;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(romanToInt("IX"));
	}

}
