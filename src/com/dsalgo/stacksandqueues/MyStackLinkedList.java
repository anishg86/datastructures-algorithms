package com.dsalgo.stacksandqueues;

public class MyStackLinkedList {
	
	private Object top;
	private Object bottom;
	private int length;
	
	public MyStackLinkedList() {
		this.top = null;
		this.bottom = null;
		this.length = 0;
	}
	
	public void push(Node node) {
		if(length ==0) {
			this.top = node;
			this.bottom = node;
		}else {
			Node topNode = (Node) this.top;
			node.setNext(topNode);
			this.top = node;
		}
		length++;
	}
	
	public void pop() {
		if(length ==0) {
			throw new IllegalArgumentException("Stack is empty");
		}else {
			Node topNode = (Node) this.top;
			this.top = topNode.getNext();
			length--;
		}
	}
	
	public Node peek() {
		if(length ==0) {
			throw new IllegalArgumentException("Stack is empty");
		}else {
			return (Node) this.top;
		}
	}
	
	public int size() {
		return this.length;
	}

}
