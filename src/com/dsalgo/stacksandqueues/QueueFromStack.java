package com.dsalgo.stacksandqueues;

import java.util.Stack;

public class QueueFromStack {
	
	private Stack<Integer> queueStack;
	
	private Stack<Integer> reverseStack;
	
	public QueueFromStack() {
		queueStack = new Stack<Integer>();
		reverseStack = new Stack<Integer>();
	}
	
	public void enqueue(Integer value) {
		if(queueStack.isEmpty()) {
			queueStack.add(value);
		}else {
			while(!queueStack.isEmpty()) {
				reverseStack.add(queueStack.pop());
			}
			queueStack.add(value);
			while(!reverseStack.isEmpty()) {
				queueStack.add(reverseStack.pop());
			}
		}
	}
	
	public Integer dequeue() {
		if(!queueStack.isEmpty()) {
			return queueStack.pop();
		}else {
			return null;
		}
	}
	
	public Integer peek() {
		if(!queueStack.isEmpty()) {
			return queueStack.peek();
		}else {
			return null;
		}
	}

}
