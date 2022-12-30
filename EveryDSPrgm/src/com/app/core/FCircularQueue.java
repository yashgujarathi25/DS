package com.app.core;

public class FCircularQueue<T> {
	private int rear, front, size;
	private T[] arr;
	private int count=0;
	
	public FCircularQueue() {
		this.size = 10;
		front = rear = -1;
		arr = (T[])new Object[size];
	}
	
	public FCircularQueue(int size) {
		this.size=size;
		front = rear = -1;
		arr = (T[])new Object[size];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == arr.length;
	}
	
	public boolean enqueue(T data) {
		if(!isFull()) {
			rear = (rear+1) % arr.length;
			arr[rear] = data;
			if(front == -1) {
				front = 0;
			}
			count = count + 1;
			return true;
		}
		return false;
	}
	
	public T dequeue() {
		if(!isEmpty()) {
			T temp = arr[front];
			front = (front + 1) % arr.length;
			count = count - 1;
			return temp;
		}
		return null;
	}
	
	public T peek() {
		if(!isEmpty()) {
			T temp = arr[front];
			return temp;
		}
		return null;
	}
}
