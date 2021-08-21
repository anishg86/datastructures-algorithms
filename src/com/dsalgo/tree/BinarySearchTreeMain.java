package com.dsalgo.tree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println(" Adding elements to Binary Search Tree");
		bst.insert(new Node(9,null,null));
		bst.insert(new Node(4,null,null));
		bst.insert(new Node(20,null,null));
		bst.insert(new Node(1,null,null));
		bst.insert(new Node(6,null,null));
		bst.insert(new Node(15,null,null));
		bst.insert(new Node(170,null,null));
		bst.traverseAndPrint();
		System.out.println("Checking if 170 in the tree : "+bst.lookup(170));
		System.out.println("Removing 20 from tree. :"+bst.remove(20));
		bst.traverseAndPrint();

	}

}
