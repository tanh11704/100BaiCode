package Exercise_13;

import java.util.Iterator;

public class Solution {
	public static void reverseString(char[] s) {
		
		int left = 0;
	    int right = s.length - 1;
	    
	    while (left < right) {
	        char temp = s[left];
	        s[left] = s[right];
	        s[right] = temp;
	        
	        left++;
	        right--;
	    }
	    
	    System.out.print("[\"");
	    for (int i = 0; i < s.length; i++) {
	        if (i == s.length - 1) {
	            System.out.print(s[i] + "\"]");
	        } else {
	            System.out.print(s[i] + "\",\"");
	        }
	    }
		
	}
	public static void main(String[] args) {
		char[] s = {'H','a','n','n','a','h'};
		reverseString(s);
	}
}
