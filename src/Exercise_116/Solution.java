package Exercise_116;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
	public static int[] findErrorNums(int[] nums) {
		int[] result = new int[2];
		
		Arrays.sort(nums);
		int length = nums.length;
		int sum = length * (length + 1) / 2;
		
		for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result[0] = nums[i];
            }
            sum -= nums[i];
        }
		
		sum -= nums[length - 1];
		result[1] = sum + result[0];
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,4};
		int[] result = findErrorNums(arr);
		
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
}
