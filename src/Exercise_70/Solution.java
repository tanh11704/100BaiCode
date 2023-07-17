package Exercise_70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static String[] findRelativeRanks(int[] score) {
		
		List<Integer> sort = new ArrayList<>();
		for (int i = 0; i < score.length; i++) {
			sort.add(score[i]);
		}
		
		Collections.sort(sort);
		Collections.reverse(sort);
		
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < sort.size(); i++) {
			switch (i) {
			case 0:
				map.put(sort.get(i), "Gold Medal");
				break;
			case 1:
				map.put(sort.get(i), "Silver Medal");
				break;
			case 2:
				map.put(sort.get(i), "Bronze Medal");
				break;
			default:
				map.put(sort.get(i), String.valueOf(i+1));
				break;
			}
		}
		
		String[] result = new String[score.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = map.get(score[i]);
		}

		return result;
	}
	
	public static void main(String[] args) {
		int[] score = {10,3,8,9,4};
		String[] result = findRelativeRanks(score);
		for (String string : result) {
			System.out.println(string);
		}
	}
}
