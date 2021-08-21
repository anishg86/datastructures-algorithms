package com.dsalgo.tree;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	/*
	 * Binary Search Tree insert using recursion
	 */
	public boolean insert(Node node) {
		if(root==null) {
			this.root = node;
		}else {
			Node rootNode = this.root;
			return insertNode(node, rootNode);
		}
		return false;
	}

	private boolean insertNode(Node node, Node rootNode) {
		if(rootNode.getValue()>node.getValue()) {
			if(rootNode.getLeft()==null) {
				rootNode.setLeft(node);
				return true;
			}else {
				rootNode = rootNode.getLeft();
				return insertNode(node, rootNode);
			}
		}else if(rootNode.getValue()<node.getValue()) {
			if(rootNode.getRight()==null) {
				rootNode.setRight(node);
				return true;
			}else {
				rootNode = rootNode.getRight();
				return insertNode(node, rootNode);
			}
		}
		return false;
	}
	
	public void traverseAndPrint() {
		Node node = root;
		traverse(node);
		
	}
	
	/*
	 * Binary Search Tree travesral using recursion
	 */
	private void traverse(Node node) {
		if(node!=null) {
			System.out.println("\t"+node.getValue()+"\t");
			if(node.getLeft()!=null) {
				System.out.println();
				traverse(node.getLeft());
			}
			if(node.getRight()!=null) {
				System.out.println();
				traverse(node.getRight());
			}
		}
		
	}

	public boolean lookup(int value) {
		Node baseNode = root;
		return lookUpValue(value, baseNode);
	}
	private boolean lookUpValue(int value, Node baseNode) {
		if(baseNode!=null) {
			if(value==baseNode.getValue()) {
				return true;
			}
			if(baseNode.getValue()>value) {
				return lookUpValue(value, baseNode.getLeft());
			}else if(baseNode.getValue()<value) {
				return lookUpValue(value, baseNode.getRight());
			}
		}
		return false;
	}
	/*/
	 * TODO-IMPORTANT Remove function need revisit
	 */
	public boolean remove(int value) {
		Node baseNode = root;
		return removeNode(baseNode,value);
	}
	private boolean removeNode(Node baseNode, int value) {
		if(baseNode!=null) {
			if(baseNode.getValue()==value) {
				baseNode.setRight(baseNode.getRight());
			}
			if(baseNode.getValue()>value) {
				return removeNode(baseNode.getLeft(),value);
			}else if(baseNode.getValue()<value) {
				return removeNode(baseNode.getRight(),value);
			}
		}
		return false;
	}

}
