package Exercise_25;

import java.util.Arrays;

public class Solution {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	    int[] result = new int[nums1.length];
	    for (int i = 0; i < nums1.length; i++) {
	        int j;
	        for (j = 0; j < nums2.length; j++) {
	            if (nums2[j] == nums1[i]) {
	                break;
	            }
	        }
	        boolean found = false;
	        for (int k = j + 1; k < nums2.length; k++) {
	            if (nums2[k] > nums1[i]) {
	                result[i] = nums2[k];
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            result[i] = -1;
	        }
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] result = nextGreaterElement(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}
}
