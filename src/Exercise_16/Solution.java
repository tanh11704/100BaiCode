package Exercise_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public static int calPoints(String[] operations) {
		List<Integer> scores = new ArrayList<Integer>();
		
		for (int i = 0; i < operations.length; i++) {
			switch (operations[i]) {
			case "+":
				scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
				break;
			case "D":
				scores.add(scores.get(scores.size() - 1) * 2);
				break;
			case "C":
				scores.remove(scores.size() - 1);
				break;
			default:
				scores.add(Integer.parseInt(operations[i]));
				break;
			}
		}
		
		int score = 0;
		
		for (Integer i : scores) {
			score += i;
		}

		return score;
	}
	
	public static void main(String[] args) {
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(ops));
	}
}
