package stackInJava;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		Stack<Integer> stack = new Stack<>();
		
		stack.push(12);
		stack.push(34);
		stack.push(33);
		System.out.println(stack);
		
		int popped=stack.pop();
		System.out.println(popped);
		
		
	   int picked= stack.peek();
	   System.out.println(picked);
	 
	   
	 
	   
	  boolean stacked= stack.empty();
	   System.out.println(stacked);
		
		int searching=stack.search(34);
		System.out.println(searching);
		
	}

}
