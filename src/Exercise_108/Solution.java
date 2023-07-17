package Exercise_108;

public class Solution {
	public static int reverse(int x) {
		boolean isNegative = x < 0;
		
		StringBuilder input = (new StringBuilder()).append(Math.abs(x)); 
		input.reverse();
		
		if (isNegative) {
			input.insert(0, '-');
		}
		
		try {
			return Integer.parseInt(input.toString());
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
