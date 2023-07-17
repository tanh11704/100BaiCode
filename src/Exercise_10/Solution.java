package Exercise_10;

public class Solution {
	public static int findComplement(int num) {
		String result = "";
		String binaryNum = Integer.toBinaryString(num);
		for (int i = 0; i < binaryNum.length(); i++) {
			if (binaryNum.charAt(i) == '1') {
				result += "0";
			} else {
				result += "1";
			}
		}
		return Integer.parseInt(result, 2);
	}
	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
}
