package DSA;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		System.out.println(new BestTimeToBuyAndSellStock().bestTimeToBuyAndSellStock(new int[] {7,1,5,3,6,4 }));

	}

	private int bestTimeToBuyAndSellStock(int[] nums) {
		int min = nums[0], res = 0;
		for (int i = 1; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
			res = Math.max(res, nums[i] - min);
		}
		return res;
	}
}
