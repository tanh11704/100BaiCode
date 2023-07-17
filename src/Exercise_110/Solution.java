package Exercise_110;

public class Solution {
	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			sum = Math.max(num, sum + num);
			
			max = Math.max(sum, max);
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));
	}
}
