//package DataStructures;

import java.util.*;

public class Queuey{


	LinkedList queue;
	
	public Queuey(){

		queue = new LinkedList();
	}

	
	// Peek at first item
	public int peek(){

		return (int)queue.get(0);
	}
public boolean isEmpty(){

		return queue.isEmpty();

	}

	public int size(){
		return queue.size();
	}

	// Enqueue
	public void enqueue(int data){

		queue.addLast(data);

	}

	public int dequeue(){
		return (int)queue.remove(0);
	}


	public static void main(String args[]){


		Queuey q1 = new Queuey();
		q1.enqueue(10);
		q1.enqueue(30);
		q1.enqueue(50);
		System.out.println(q1.peek());
		System.out.println(q1.dequeue()+" first dequeued");
		System.out.println(q1.peek());
		System.out.println(q1.dequeue()+" second dequeued");
		System.out.println(q1.dequeue()+" third dequeued");



	}
}