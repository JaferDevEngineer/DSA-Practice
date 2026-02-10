package DSA;

public class MaximumSumWithExactlyKElements {
public static void main(String[] args) {
	solution(new int[] {1,2,3,4} , 3);
}

private static void solution(int[] nums, int k) {
	// TODO Auto-generated method stub
	
	  
    int max = 0;

    int currMax = 0;
    for(int i = 0;i<nums.length;i++){
    	
    	currMax += nums[i];
        
        
        if(i> k - 1){
           currMax -= nums[i - k];
        }
        
       
        max = Math.max(max,currMax);
    }
    System.out.println(max);
	
}
}
