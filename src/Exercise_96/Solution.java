package Exercise_96;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	public static boolean isHappy(int n) {

		Set<Integer> storeNumbers = new HashSet<>();
		storeNumbers.add(n);
		List<Integer> digits = new ArrayList<>();
		
		while (true) {
			
			//Trả về mảng chữ số
			digits.removeAll(digits);
			while (n != 0) {
				digits.add(n % 10);
				n /= 10;
			}
			
			int num = 0;
			for (Integer i : digits) {
				num += i*i;
			}
			
			n = num;
			
			if (n == 1) {
				return true;
			} else  if (storeNumbers.contains(num)) {
				return false;
			} else {
				storeNumbers.add(num);
			}
			
		}
	}

	public static void main(String[] args) {
		System.out.println(isHappy(7));
	}

}
