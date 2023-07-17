package Exercise_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public static boolean backspaceCompare(String s, String t) {
		ArrayList<String> arr_s = new ArrayList<String>(Arrays.asList(s.split("")));
		ArrayList<String> arr_t = new ArrayList<String>(Arrays.asList(t.split("")));
		
		for (int i = 0; i < arr_s.size(); i++) {
			if (arr_s.get(i).equals("#")) {
				if (i==0) {
					arr_s.remove(i);
					i--;
				} else {
					arr_s.remove(i-1);
					arr_s.remove(i-1);
					i-=2;
				}
			}
		}
		for (int i = 0; i < arr_t.size(); i++) {
			if (arr_t.get(i).equals("#")) {
				if (i==0) {
					arr_t.remove(i);
					i--;
				} else {
					arr_t.remove(i-1);
					arr_t.remove(i-1);
					i-=2;
				}
			}
		}
		
		System.out.println("S:");
		for (String string : arr_t) {
			System.out.println(string);
		}
		System.out.println("T:");
		for (String string : arr_s) {
			System.out.println(string);
		}
		
		if (arr_s.size() != arr_t.size()) {
			return false;
		} else {
			for (int i = 0; i < arr_s.size(); i++) {
				if (!arr_s.get(i).equals(arr_t.get(i))) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(backspaceCompare("a##c", "#a#c"));
	}
}
