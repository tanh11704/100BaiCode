package Exercise_6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static  boolean check(int number) {
		int soBanDau = number;
		while (number != 0) {
			int sodu = number % 10;
			if (sodu == 0 || soBanDau % sodu != 0) {
				return false;
			}
			number /= 10;
		}
		return true;
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (check(i) == true) {
				result.add(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(47, 85));
//		System.out.println(check(1));
	}
}
