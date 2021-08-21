package com.dsalgo.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		Node node = new Node();
		node.setValue(1);
		MyLinkedList<Integer> ll1 = new MyLinkedList<Integer>(node);
		System.out.println("Linked list initalized: ");
		System.out.println("Linked list length: "+String.valueOf(ll1.size()));
		System.out.println("Append to linked list : ");
		for(int i=1;i<5;i++) {
			Node node2 = new Node();
			node2.setValue(i*3);
			ll1.append(node2);
		}
		System.out.println("Linked list length after append: "+String.valueOf(ll1.size()));
		System.out.println("Prepend to linked list : ");
		Node node3 = new Node();
		node3.setValue(21*3);
		//ll1.prepend(node3);
		ll1.printAllNodes();
		//To insert uncomment below
		//ll1.insert(2, node3);
		//To remove uncomment below
		//ll1.remove(1);
		ll1.printAllNodes();
		ll1.reverse();
		ll1.printAllNodes();
		
		//Double Linked List Testing starts below
		MyDoubleLinkedList<Integer> ll2 = new MyDoubleLinkedList<Integer>(node);
		System.out.println("Double Linked list initalized: ");
		System.out.println("Double Linked list length: "+String.valueOf(ll2.size()));
		System.out.println("Append to Double linked list : ");
		for(int i=1;i<5;i++) {
			Node node2 = new Node();
			node2.setValue(i*3);
			ll2.append(node2);
		}
		System.out.println("Double Linked list length after append: "+String.valueOf(ll2.size()));
		System.out.println("Double Prepend to linked list : ");
		Node node4 = new Node();
		node4.setValue(4*3);
		//ll2.prepend(node3);
		ll2.printAllNodes();
		//To insert uncomment below
		//ll2.insert(2, node3);
		//To remove uncomment below
		ll2.remove(1);
		ll2.printAllNodes();
		


	}

}
