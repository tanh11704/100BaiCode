package Exercise_55;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new LinkedList<>();
		
		for (int i : nums1) {
			set.add(i);
		}

		for (int i : nums2) {
			if (set.contains(i)) {
				set.remove(i);
				list.add(i);
			}
		}
		
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] result = intersection(nums1, nums2);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
