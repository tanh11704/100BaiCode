package Exercise_89;

import java.util.Arrays;

public class Solution {
	public static int dominantIndex(int[] nums) {
		int maxNum = nums[0];
		int index = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > maxNum) {
				maxNum = nums[i];
				index = i;
			}
		}
		
		Arrays.sort(nums);
		if (nums[nums.length - 1] / 2 >= nums[nums.length - 2]) {
			return index;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(dominantIndex(nums));
	}
}
