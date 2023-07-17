package Exercise_73;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static String[] findRestaurant(String[] list1, String[] list2) {
		List<String> listResult = new ArrayList<>();

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i])) {
				int sum = map.get(list2[i]) + i;
				if (sum < min) {
					listResult.clear();
					listResult.add(list2[i]);
					min = sum;
				} else if (sum == min) {
					listResult.add(list2[i]);
					min = sum;
				}
			}
		}

		String[] arrResult = new String[listResult.size()];
		for (int i = 0; i < arrResult.length; i++) {
			arrResult[i] = listResult.get(i);
		}
		return arrResult;
	}

	public static void main(String[] args) {
		String[] list1 = { "happy", "sad", "good" };
		String[] list2 = { "sad", "happy", "good" };
		String[] result = findRestaurant(list1, list2);
		for (String string : result) {
			System.out.println(string);
		}
	}
}
