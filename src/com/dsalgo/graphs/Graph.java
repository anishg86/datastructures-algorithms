package com.dsalgo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	
	private int numberOfNodes;
	private Map<Integer, ArrayList<Integer>> adjacentList;
	
	public Graph() {
		this.numberOfNodes = 0;
		this.adjacentList = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	public void addVertex(int node) {
		if(adjacentList.get(node)==null) {
			adjacentList.put(node,new ArrayList<Integer>());
			numberOfNodes++;
		}
	}
	
	public void addEdge(int node1, int node2) {
		if(adjacentList.get(node1)==null || adjacentList.get(node2)==null) {
			throw new IllegalArgumentException("Invalid Node/Vertex");
		}
		adjacentList.get(node1).add(node2);
		adjacentList.get(node2).add(node1);
	}
	
	public void showConnections() {
		if(numberOfNodes>0) {
			System.out.println("Graph Connections are :"+adjacentList.toString());
		}
	}

}
