package com.comp.client.list;

public class Stack {

	public static void main(String[] args) {
		
		java.util.Stack stack = new java.util.Stack();
		stack.push("Akshay");
		stack.push("Ronit");
		stack.push("Toshit");
		
		System.out.println("Items in Stack are: "+stack);
		System.out.println("Top item in stack is : "+stack.peek());
		stack.pop();
		
		System.out.println("Elements in Stacks are : "+stack);

	}

}
