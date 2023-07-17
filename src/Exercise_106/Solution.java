package Exercise_106;

public class Solution {
	public static int removeElement(int[] nums, int val) {
		int i = 0, j = nums.length - 1;
		
		while (i <= j) {
			if (nums[i] == val) {
				nums[i] = nums[j];
				j--;
			} else {
				i++;
			}
		}
		
		return j + 1;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		System.out.println(removeElement(nums, 2));
	}
}
