package Exercise_4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static int findMax(int[] candies) {
		int max = candies[1];
		for (int i : candies) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<Boolean>();
		for (int i : candies) {
			if (extraCandies + i >= findMax(candies)) {
				result.add(true);
			} else {
				result.add(false);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		System.out.println(kidsWithCandies(candies, 3));
	}
}
