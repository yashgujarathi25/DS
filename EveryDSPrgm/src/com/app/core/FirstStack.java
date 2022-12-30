package com.app.core;

public class FirstStack<T> {

	private T[] arr;
	private int top, size;
	
	
	public FirstStack() {
		super();
		size = 10;
		arr = (T[]) new Object[size];
		top = -1;
				
	}


	public FirstStack(int size) {
		super();
		this.size = size;
		top=-1;
		arr = (T[])new Object[size];
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean push(T data ) {
		if(!isFull()) {
			top=top+1;
			arr[top]=data;
			return true;
		}
		return false;
	}
	
	public boolean pop() {
		if(!isEmpty()) {
			T temp = arr[top];
			top = top -1 ;
			return true;
		}
		return false;
	}
	
	public T peek() {
		if(!isEmpty()) {
			T temp = arr[top];
			return temp;
		}
		return null;
	}
}
