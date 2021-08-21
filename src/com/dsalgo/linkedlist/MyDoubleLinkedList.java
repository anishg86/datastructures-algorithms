 package com.dsalgo.linkedlist;

public class MyDoubleLinkedList<T> {
	
	private Node head;
	private Node tail;
	private int length;
	
	public MyDoubleLinkedList(Node node) {
		node.setPrevious(null);
		node.setNext(null);
		this.head = node;
		this.tail = this.head;
		this.length = 1;
	}
	
	public void append(Node node) {
		Node nodeTail = this.tail;
		this.tail = node;
		node.setNext(null);
		nodeTail.setNext(this.tail);
		node.setPrevious(nodeTail);
		this.length++;
		
	}
	
	public void prepend(Node node) {
		Node nodeHead = this.head;
		this.head = node;
		node.setNext(nodeHead);
		nodeHead.setPrevious(this.head);
		this.length++;
	}
	
	public void insert(int index,Node nodeInput) {
		if(index>length) {
			throw new IllegalArgumentException("Illegal index");
		}
		Node nodeIterator = this.head;
		Node nodePrevious = null;
		int iterator = 0;
		while(iterator<=index && nodeIterator!=null) {
			if(iterator==index) {
				nodePrevious.setNext(nodeInput);
				nodeInput.setPrevious(nodePrevious);
				nodeInput.setNext(nodeIterator);
				nodeIterator.setPrevious(nodeInput);
				length++;
				break;
			}
			nodePrevious = nodeIterator;
			nodeIterator = (Node) nodeIterator.getNext();
			iterator++;
		}
	}
	
	public void remove(int index) {
		if(index>length) {
			throw new IllegalArgumentException("Illegal index");
		}
		Node nodeIterator = this.head;
		Node nodePrevious = null;
		Node nodeNext = null;
		int iterator = 0;
		while(iterator<=index && nodeIterator!=null) {
			if(iterator==index) {
				nodePrevious.setNext(nodeNext);
				nodeNext.setPrevious(nodePrevious);
				length--;
				break;
			}
			nodePrevious = nodeIterator;
			nodeIterator = (Node) nodeIterator.getNext();
			nodeNext = (Node) nodeIterator.getNext();
			iterator++;
		}
	}
	
	public int size() {
		return length;
	}
	
	public void printAllNodes(){
		Node node = this.head;
		int len = length;
		while(len!=0) {
			System.out.println("Node value: "+String.valueOf(node.getValue()));
			node = (Node) node.getNext();
			len--;
		}
	}

}
