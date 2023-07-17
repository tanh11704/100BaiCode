package Exercise_83;

import java.util.Arrays;

public class Solution {
	public static int missingNumber(int[] nums) {
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i) {
				return i;
			}
		}

		return nums[nums.length - 1] + 1;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));
	}
}
