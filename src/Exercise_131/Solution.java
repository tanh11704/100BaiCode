package Exercise_131;

public class Solution {
	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		int maxSum = sum;
		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		return (double) maxSum / k;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		System.out.println(findMaxAverage(nums, 4));
	}
}
