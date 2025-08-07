package DSA;

import java.util.Arrays;

public class SetMatrixZeros {
	public static void main(String[] args) {

		int[][] result = new SetMatrixZeros().setZeroes(new int[][] { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9} });
		for(int[] i : result) {
			
			System.out.println(Arrays.toString(i));
		}
//		 { 1, 2, 3 }, 
//		 { 4, 0, 6 }, 
//		 { 7, 8, 9 }
	}

	private int[][] setZeroes(int[][] is) {

		boolean[] columns = new boolean[is.length];
		boolean[] rows = new boolean[is[0].length];
		
		for (int i = 0; i < is.length; i++) {
			for (int j = 0; j < is[i].length; j++) {
				if (is[i][j] == 0) {
					columns[i] = true;
					rows[j] = true;
				}
			}
		}

			for (int i = 0; i < is.length; i++) {
				for (int j = 0; j < is[i].length; j++) {
					if(columns[i] || rows[j] ) {
						is[i][j] = 0;
					}
				}
			}
		return is;
	}
}
