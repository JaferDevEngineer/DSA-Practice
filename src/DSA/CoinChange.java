package DSA;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CoinChange {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,5},11));
	}

	private static int solution(int[] coins, int amount) {
		int[] dp  =new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0] = 0;
		
		for(int i = 1;i<=amount; i++) {
			for(int coin:coins) {
				if(i>=coin)
					dp[i] = Math.min(dp[i], dp[i-coin]+1);
			}
		}
		return dp[amount]> amount ?  -1:dp[amount];
	}
}
