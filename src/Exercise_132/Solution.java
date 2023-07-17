package Exercise_132;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		boolean found = false;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length && !found; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
		        result[0] = i;
		        result[1] = map.get(complement);
		        found = true;
		    }
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 2, 4};
		int[] result = twoSum(arr, 6);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
}
