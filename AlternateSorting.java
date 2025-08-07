package DSA;

import java.util.Arrays;

public class AlternateSorting {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(alternateSorting(arr)));
	}

	private static int[] alternateSorting(int[] arr) {
		int length =arr.length,start = 0,end=length-1,index=0;
		
		int[] result = new int[length];
		
		while(start<=end) {
			if(index<length)
				result[index++] = arr[end--];
			if(index <length)
				result[index++] = arr[start++];
						
		}
		return result;
	}
}
