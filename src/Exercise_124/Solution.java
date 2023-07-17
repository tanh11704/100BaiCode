package Exercise_124;

public class Solution {
	public static boolean isPerfectSquare(int num) {
		
		long l = 1, r = num;
		
		while (l <= r) {
			
			long mid = l + (r - l) / 2;
			
			if (mid * mid == num) {
				return true;
			} else if (mid * mid < num) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
			
		}
		
		return false;

	}
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(2147483647));
	}
}
