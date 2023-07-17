package Exercise_33;

import java.util.Iterator;

public class Solution {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				max = count(nums, i) > max ? count(nums, i) : max;
			}
		}
		return max;
	}
	
	public static int count(int arr[], int index) {
		int count = 0;
		
		for (int i = index; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				break;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1};
		
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				max = count(nums, i) > max ? count(nums, i) : max;
			}
		}
		System.out.println(max);
	}
}
