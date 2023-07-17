package Exercise_49;

public class Solution {

	public static boolean checkUp(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static boolean checkDown(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static boolean isMonotonic(int[] nums) {
		if (checkUp(nums) || checkDown(nums)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = {1,3,2};
		
		System.out.println(isMonotonic(nums));
	}

}
