package Exercise_24;

import java.util.Iterator;

public class Solution {

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrimeSetBits(int left, int right) {
		int result = 0;

		for (int i = left; i <= right; i++) {
			int temp = i, count = 0;
			while (temp > 0) {
				count += temp % 2;
				temp /= 2;
			}
			if (isPrime(count)) {
				result++;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(countPrimeSetBits(6, 10));
	}
}
