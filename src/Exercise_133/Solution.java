package Exercise_133;

public class Solution {
	public static int trailingZeroes(int n) {
		int count = 0;
	    for (int i = 5; i <= n; i *= 5) {
	        count += n / i;
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		System.out.println(trailingZeroes(30));
	}
}
