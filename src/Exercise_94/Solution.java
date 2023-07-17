package Exercise_94;

public class Solution {
	public static String addStrings(String num1, String num2) {
		int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
            i--;
            j--;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(addStrings("6913259244", "71103343"));
	}
}
