package com.dsalgo.stacksandqueues;

public class StackMain {

	public static void main(String[] args) {
		//Testing LinkedList Array
		MyStackLinkedList stack = new MyStackLinkedList();
		System.out.println("Adding element to Stack");
		stack.push(new Node("google"));
		stack.push(new Node("udemy"));
		stack.push(new Node("linkedIn"));
		System.out.println("Getting top element from stack: "+stack.peek().getValue());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(new Node("facebook"));
		System.out.println("Getting top element from stack: "+stack.peek().getValue());

		//Testing Array Stack
		MyStackArray stack1 = new MyStackArray();
		System.out.println("Adding element to Stack Array");
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.println("Getting top element from stack Array: "+stack1.peek());
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.push(4);
		System.out.println("Getting top element from stack Array: "+stack1.peek());

	}

}
