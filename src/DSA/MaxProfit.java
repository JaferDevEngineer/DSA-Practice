package DSA;

public class MaxProfit {

	public static void main(String[] args) {
		maxProfitV4(new int[] { 7, 1, 5, 3, 6, 4 });
	}

	private static void maxProfitV4(int[] nums) {
		
		
		
		int min = Integer.MAX_VALUE,max = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]<min) {
				min = nums[i];
			}else {
				if(nums[i]>max) {
					max = nums[i];
				}
			}
		}
	}

	private static int maxProfit(int[] numbers) {
		int min = Integer.MAX_VALUE, max = 0;

		for (int i : numbers) {

			if (i < min)
				min = i;
			else {
				int profit = i - min;
				if (profit > max) {

					max = profit;
				}
			}
		}

		System.out.println("Maximum Profit : " + max);
		return max;

	}

	public static int maxProfitV2(int[] prices) {
		int minPrice = Integer.MAX_VALUE; // To track the lowest price so far
		int maxProfit = 0; // To track the maximum profit so far

		for (int price : prices) {
			// Update the minimum price if the current price is lower
			if (price < minPrice) {
				minPrice = price;
			} else {
				// Calculate the profit if we sell at the current price
				int profit = price - minPrice;
				// Update the maximum profit if the current profit is higher
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}

	public static int maxProfitV3(int[] prices) { // { 7, 1, 5, 3, 6, 4 }

		int min = Integer.MAX_VALUE, max = 0;
		for(int i :prices) {
			if(i<min) {
				min = i;
			}else {
				int high = i-min;
				if(high>max) {
					max = high;
				}
			}
		}
		System.out.println("max " + max);
		return max;
	}
}
