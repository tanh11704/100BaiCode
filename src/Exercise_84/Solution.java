package Exercise_84;

public class Solution {
	
	public static int countA(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				count++;
			}
		}
		
		
		return count;
	}
	
	public static int countL(String s) {
	    int count = 0;
	    int maxCount = 0;
	    
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == 'L') {
	            count++;
	        } else {
	            if (count > 0) {
	                maxCount = Math.max(maxCount, count);
	                count = 0;
	            }
	        }
	    }
	    
	    return Math.max(maxCount, count);
	}
	
	public static boolean checkRecord(String s) {
		
		int countA = countA(s);
		int countP = countL(s);
		
		if (countA < 2 && countP < 3) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLP"));
	}
}
