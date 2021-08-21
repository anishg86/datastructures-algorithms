package com.dsalgo.stacksandqueues;

public class MyQueue {
	
	private Object first;
	private Object last;
	private int length;
	
	public MyQueue() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public void enqueue(Node node) {
		if(length ==0) {
			this.first = node;
			this.last = node;
		}else {
			Node lastNode = (Node) this.last;
			lastNode.setNext(node);
			this.last = node;
		}
		length++;
	}
	
	public void dequeue() {
		if(length ==0) {
			throw new IllegalArgumentException("Queue is empty");
		}else {
			Node firstNode =(Node) this.first;
			this.first = firstNode.getNext();
			length--;			
		}
	}
	
	public Node peek() {
		return (Node) this.first;
	}
	
	public int size() {
		return this.length;
	}

}
