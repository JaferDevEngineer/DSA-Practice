package DSA;

import java.util.Arrays;

public class SetMatrixZeros {
	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9} };
		new  SetMatrixZeros().setMatrixZeroV2(matrix);

//		new SetMatrixZeros().setMatrixZeroV2(new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}});
		for(int[] i : matrix) {
			
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
	
	public int[][] setMatrixZero(int[][] matrix){
		int rowSize = matrix.length,columnSize = matrix[0].length;
		
		
		boolean firstRowHasZero = false,firstColumnHasZero = false;
		
		for(int i=0;i<rowSize;i++) {
			if(matrix[i][0] == 0) firstRowHasZero = true;
		}
		for(int i=0;i<columnSize;i++) {
			if(matrix[0][i] == 0) firstColumnHasZero = true;
		}
		
		for(int i = 1;i<rowSize;i++) {
			for(int j = 1;j<columnSize;j++) {
				if(matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		for(int i = 1;i<rowSize;i++) {
			for(int j = 1;j<columnSize;j++) {
				if( matrix[0][j]== 0 ||matrix[i][0] == 0 ) {
					matrix[i][j] = 0;
				}
			}
		}
		if(firstRowHasZero) {
			for(int i=0;i<rowSize;i++)
				matrix[i][0] =0;
		}
		if(firstColumnHasZero) {
			for(int i=0;i<columnSize;i++)
				matrix[0][i] =0;
		}
		return matrix;
	}
	public void setMatrixZeroV2(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		int rowSize = matrix.length,columnSize = matrix[0].length;
		
		
		for(int i =0;i<rowSize;i++) {
			for(int j = 0;j<columnSize;j++) {
				if(matrix[i][j] == 0) {
					
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0;i<rowSize;i++) {
			for(int j = 0;j<columnSize;j++) {
				if(row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
//		
		System.out.println(Arrays.toString(row));
		System.out.println(Arrays.toString(column));
		
		
	}
}
