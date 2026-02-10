package DSA;

import java.util.Stack;

public class MinStackExample {

//	public static void main(String[] args) {
////		Stack<Integer> stack =  new Stack<>();
////		stack.push(1);
////		stack.push(2);
////		System.out.println(stack);
//		MinStack minStack = new MinStackExample().new MinStack();
//		minStack.push(-2);
//		minStack.push(0);
//		minStack.push(-3);
//		System.out.println(minStack.getMin());
//		minStack.getMin(); // return -3
//		minStack.pop();
//		minStack.top();    // return 0
//		minStack.getMin(); // return -2
//		System.out.println(minStack);
//	}
//	
//	public class MinStack {
//		
//		Stack<Integer> stack =  new Stack<>();
//
//		Stack<Integer> minStack =  new Stack<>();
//		
//		
//		
//		public void push(int i) {
//			stack.push(i);
//			
//			if(minStack.isEmpty())
//				minStack.push(i);
//			else
//				minStack.push(Math.min(i, minStack.peek()));
//		}
//		public int peek() {
//			return stack.peek();
//		}
//		public void pop() {
//			
//			 stack.pop();
//			 minStack.pop();
//			
//		}
//		public int top() {
//			return stack.peek();
//		}
//		public int getMin() {
//			return minStack.peek();
//		}
//		public String toString() {
//			return "mainStack : "+stack.toString()+" minStack "+minStack.toString();
//		}
//		
//	}
	
	
	
	
	Stack<Integer> mainStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	 
	    
	    public void push(int val) {
	        mainStack.push(val);
	        
	        if(minStack.isEmpty())
	        	minStack.push(val);
	        else {
	        	minStack.push(Math.min(val, minStack.peek()));
	        }
	    }
	    
	    public void pop() {
	        mainStack.pop();
	        minStack.pop();
	    }
	    
	    public int top() {
	        return mainStack.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
	
}
