package com.dsalgo.stacksandqueues;

public class QueueMain {

	public static void main(String[] args) {
		//Testing LinkedList Queue
		MyQueue queue = new MyQueue();
		System.out.println("Adding element to Queue");
		queue.enqueue(new Node("Sam"));
		queue.enqueue(new Node("Alex"));
		queue.enqueue(new Node("Tom"));
		System.out.println("Getting first element from queue: "+queue.peek().getValue());
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		//queue.dequeue();
		
		//Testing Queue created from stack
		QueueFromStack queueStack = new QueueFromStack();
		System.out.println("Adding element to Queue from Stack");
		queueStack.enqueue(1);
		queueStack.enqueue(2);
		queueStack.enqueue(3);
		System.out.println("Getting first element from queue from stack: "+queueStack.peek());
		queueStack.dequeue();
		queueStack.dequeue();
		queueStack.dequeue();
		queueStack.dequeue();

	}

}
