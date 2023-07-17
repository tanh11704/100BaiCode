package Exercise_90;

public class Solution {
	public static int maxProfit(int[] prices) {
		
		int maxProfit = 0;
		int minPrice = prices[0];
		
		for (int price : prices) {
			minPrice = Math.min(minPrice, price);
			int profit = price - minPrice;
			maxProfit = Math.max(maxProfit, profit);
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
}
