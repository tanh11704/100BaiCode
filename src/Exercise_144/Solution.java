package Exercise_144;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
	public static int[] diStringMatch(String s) {
		
		int n = s.length();
	    int[] result = new int[n + 1];
	    int left = 0, right = n;
	    
	    for (int i = 0; i < n; i++) {
	        if (s.charAt(i) == 'I') {
	        	result[i] = left;
	            left++;
	        } else {
	        	result[i] = right;
	            right--;
	        }
	    }
	    
	    result[n] = left;
	    return result;
	    
	}
	
	public static void main(String[] args) {
		int[] arr = diStringMatch("DIIDI");
		System.out.println(Arrays.toString(arr));
	}
}
