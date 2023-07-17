package Exercise_31;

import java.util.Iterator;

public class Solution {

	public static int singleNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (checkNumber(nums, i)) {
				return nums[i];
			}
		}
		return -1;
	}
	
	public static boolean checkNumber(int[] arr, int index) {
		for (int i = 0; i < index; i++) {
			if (arr[index] == arr[i]) {
				return false;
			}
		}
		for (int i = index + 1; i < arr.length; i++) {
			if (arr[index] == arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] nums = {2, 2, 1};
		
		System.out.println(checkNumber(nums, 1));
		System.out.println(singleNumber(nums));
	}

}
