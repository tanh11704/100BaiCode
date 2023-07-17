package Exercise_137;

public class Solution {
	public static int arrangeCoins(int n) {
		
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n == i) {
				return count + 1;
			} else if (n < i) {
				return count;
			} else {
				n -= i;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(arrangeCoins(10));
	}
}
