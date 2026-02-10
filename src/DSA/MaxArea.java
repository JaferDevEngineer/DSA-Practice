package DSA;

public class MaxArea {
	public static void main(String[] args) {
		
		System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}
	 public static int maxArea(int[] height) {
		 
		 int left = 0,right = height.length - 1,maxArea = 0;
		 
		 while(left<right) {
			 
			 int min = Math.min(height[left], height[right]);
			 int length = right -left;
			 int max = min*length;
			 maxArea = Math.max(maxArea, max);
			 
			 if(height[left]< height[right])
				 left++;
			 else
				 right--;
		 }
		 
		return maxArea;
	        
	    }
}
