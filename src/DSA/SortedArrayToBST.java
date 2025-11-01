package DSA;

public class SortedArrayToBST {
	
	 public TreeNode sortedArrayToBST(int[] nums) {
	        return helper(nums, 0, nums.length - 1);
	    }

	    private TreeNode helper(int[] nums, int left, int right) {
	    	System.out.println("before left "+left +" right "+right);
	        if (left > right) {
	        	System.out.println("returned");
	        	return null;
	        }

	        int mid = left + (right - left) / 2;

	        TreeNode root = new TreeNode(nums[mid]);
	        
	        System.out.println("after left "+left +" right "+right + " mid "+mid);
	        
	        root.left = helper(nums, left, mid - 1);
	        System.out.println(root.left);
	        root.right = helper(nums, mid + 1, right);

	        return root;
	    }
	    public TreeNode sortedArrayToBSTV2(int[] nums) {
	        return helperV2(nums, 0, nums.length - 1);
	    }
		private TreeNode helperV2(int[] nums, int left, int right) {
			if(left>right) return null;
			
			int mid = left + (right -left )/2;
			TreeNode root = new TreeNode(nums[mid]);
			
			root.left = helperV2(nums, left, mid - 1);
			root.right = helperV2(nums, mid+1, right);
			return root;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
			
			System.out.println(new SortedArrayToBST().sortedArrayToBSTV3(new int[] {-10, -3, 0, 5, 9}));
//			System.out.println(0+(1-0)/2);
		}
		public TreeNode sortedArrayToBSTV3(int[] nums) {
			
			return helperMethod(nums,0,nums.length -1);
	        
	    }
		public TreeNode helperMethod(int[] nums,int start,int end ) {
			if(start>end)
				return null;
			int mid = end+((start-end)/2);
			System.out.println(mid);
			TreeNode root = new TreeNode(nums[mid]);
			root.left = helperMethod(nums, start, mid - 1);
			root.right = helperMethod(nums,mid+1,end);
			return root;
		}
}
