package Exercise_74;

public class Solution {
	
	public static void swap(int[] nums, int left, int right) {
		int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
	}
	
	public static int[] sortArrayByParity(int[] nums) {
		
		int left = 0;
		int right = nums.length - 1;
		
		while (left < right) {
			while (left < right && nums[left] % 2 == 0) {
				left++;
			}
			
			while (left < right && nums[right] % 2 != 0) {
				right--;
			}
			
			if (left < right) {
				swap(nums, left, right);
			}
		}

		return nums;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,1,2,4};
		
		nums = sortArrayByParity(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
