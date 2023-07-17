package Exercise_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public static int distributeCandies(int[] candyType) {
		
		Set<Integer> kinhOfCandy = new HashSet<>();
		
		for (Integer i : candyType) {
			kinhOfCandy.add(i);
		}
		
		return (candyType.length / 2 > kinhOfCandy.size()) ? kinhOfCandy.size() : candyType.length / 2;
	}
	
	public static void main(String[] args) {
		int[] candyType = {100000,0,100000,0,100000,0,100000,0,100000,0,100000,0};
		System.out.println(distributeCandies(candyType));
		
	}
}
