package com.dsalgo.stacksandqueues;

public class Node {
	
	private Object value;
	private Object next;
	public Node(Object value) {
		this.value = value;
	}
	private Object previous;
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object next) {
		this.next = next;
	}
	public Object getPrevious() {
		return previous;
	}
	public void setPrevious(Object previous) {
		this.previous = previous;
	}
	
	

}
