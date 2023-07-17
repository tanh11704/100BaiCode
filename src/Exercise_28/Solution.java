package Exercise_28;

public class Solution {
	public static boolean hasAlternatingBits(int n) {
		
		int temp = -1;
		
		while (n != 0) {
			if (n % 2 == temp) {
				return false;
			}
			temp = n % 2;
			n /= 2;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(10));
	}
}
