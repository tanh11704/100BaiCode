package Exercise_64;

public class Solution {
	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
	    int right = numbers.length - 1;
	    
	    while (left < right) {
	        int sum = numbers[left] + numbers[right];
	        if (sum == target) {
	            return new int[]{left + 1, right + 1};
	        } else if (sum < target) {
	            left++;
	        } else {
	            right--;
	        }
	    }
	    
	    return new int[0];
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int[] result = twoSum(numbers, 9);
		
		System.out.println(result[0] + " " + result[1]);
	}
}
