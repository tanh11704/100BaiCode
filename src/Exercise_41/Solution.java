package Exercise_41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> num = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		int n = nums.length;
		
		for (int i : nums) {
			num.add(i);
		}
		
		for (int i = 1; i <= n; i++) {
			if (!num.contains(i)) {
				result.add(i);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		
		System.out.println(findDisappearedNumbers(nums));;
	}
}
