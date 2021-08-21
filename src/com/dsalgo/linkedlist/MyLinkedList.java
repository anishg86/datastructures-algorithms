package com.dsalgo.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;

public class MyLinkedList<T> {
	
	private Node head;
	private Node tail;
	private int length;
	
	public MyLinkedList(Node node) {
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
		this.length++;
		
	}
	
	public void prepend(Node node) {
		Node nodeHead = this.head;
		this.head = node;
		node.setNext(nodeHead);
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
				nodeInput.setNext(nodeIterator);
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
				length--;
				break;
			}
			nodePrevious = nodeIterator;
			nodeIterator = (Node) nodeIterator.getNext();
			nodeNext = (Node) nodeIterator.getNext();
			iterator++;
		}
	}
	
	public void reverse() {
		Node nodeIterator = this.head;
		ArrayList<Node> nodeList = new ArrayList<Node>();
		int len = length;
		while(len!=0) {
			nodeList.add(nodeIterator);
			nodeIterator = (Node) nodeIterator.getNext();
			len--;
		}
		len = length;
		while(len!=0) {
			nodeIterator = nodeList.get(len-1);
			if(len==length) {
				this.head = nodeIterator;
				this.head.setNext(nodeList.get(len-2));
			}else if(len == 1) {
				this.tail = nodeIterator;
				this.tail.setNext(null);
			}else {
				nodeIterator.setNext(nodeList.get(len-2));
			}
			len--;
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
