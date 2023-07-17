package Exercise_52;

import java.util.Iterator;

import javax.management.ValueExp;

public class Solution {
 
	public static int titleToNumber(String columnTitle) {
		int result = 0;
		int value = 0;
		
		for (char c : columnTitle.toCharArray()) {
			value = (int) c - 'A' + 1;
			result = result * 26 + value;
		}

		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(titleToNumber("ZY"));
	}
}
