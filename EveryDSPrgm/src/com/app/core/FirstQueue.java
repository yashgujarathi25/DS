package com.app.core;

public class FirstQueue<T> {

	private T[] arr;
	private int front, rear, size;
	
	public FirstQueue()
	{
		size = 5;
		front = rear = -1;
		arr = (T[])new Object[size];
	}

	public FirstQueue(int size) {
		super();
		this.size = size;
		front = rear = -1;
		arr = (T[])new Object[size];
	}
	
	public boolean isFull() {
		return rear == arr.length-1;
	}
	
	public boolean isEmpty() {
		return front == -1 || front > rear;
	}

	public boolean enQueue(T data) {
		if(!isFull()) {
			rear = rear + 1;
			arr[rear]=data;
			if(front == -1) {
				front = front + 1;
			}
			return true;
		}
		return false;
	}
	
	public T deQueue() {
		if(!isEmpty()) {
			T temp = arr[front];
			front = front + 1;
			return temp;
		}
		return null;
	}

	
}
