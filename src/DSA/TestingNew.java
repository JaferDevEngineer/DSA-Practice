package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestingNew {
	public static void main(String[] args) {
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10}; // 1,3,5,7,9,10,8,6,4,2
		int[] numbers = {9,13,1,5,12,4,8,3,2}; // 1,3,5,9,13,12,8,4,2  
		//limitation
		//memory consuming
//		HashMap<String,List<Integer>> map = new HashMap<>();
		
		int[] ascValues = new int[256];
		int[] descValues = new int[256];
		List<Integer> ascAnswer = new ArrayList<>();
		List<Integer> descAnswer = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		for(int i = 0; i<numbers.length;i++) {
			
			if(numbers[i]%2 == 0) { 
//				
				ascValues[numbers[i]] = 1;
//				ascAnswer.add(numbers[i]);
			}else {
//				List<Integer> descNum = map.getOrDefault("descending", new ArrayList<Integer>());
//				descNum.add(numbers[i]);
//				map.put("descending", descNum);
				descValues[numbers[i]] = 1;
//				descAnswer.add(numbers[i]);
			}
//			answer.addAll(descAnswer);
//			answer.addAll(ascAnswer);
		}
			
//		System.out.println(map);
		
		for(int i = 0;i<descValues.length;i++) {
			
			if(descValues[i] == 1) {
				System.out.print(i + " ");
			}
		}
		for(int i = ascValues.length -1 ;i>=0;i--) {
			
			if(ascValues[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}
}

//employess (name,email,mobileNumber,DOB)

//select * from employees where DOB LIKE '%14-07-%'
