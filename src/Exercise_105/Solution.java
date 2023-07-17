package Exercise_105;

public class Solution {
	public static String licenseKeyFormatting(String s, int k) {
		
		s = s.replaceAll("-", "").toUpperCase();
		
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
		    if (s.charAt(i) != '-') {
		        if (count == k) {
		            sb.append("-");
		            count = 0;
		        }
		        sb.append(s.charAt(i));
		        count++;
		    }
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
	}
}
