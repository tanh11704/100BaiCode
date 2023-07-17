package Exercise_82;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static int[] intersect(int[] nums1, int[] nums2) {
		
		int i = 0, j = 0;
		List<Integer> listResult = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				listResult.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		
		int[] result = new int[listResult.size()];
		for (int index = 0; index < listResult.size(); index++) {
			result[index] = listResult.get(index);
		}

		return result;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] result = intersect(nums1, nums2);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
