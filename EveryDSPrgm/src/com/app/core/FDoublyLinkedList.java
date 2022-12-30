package com.app.core;

import nodepkg.NodeD;

public class FDoublyLinkedList<T> {

	private NodeD head;

	public FDoublyLinkedList() {
		head = null;
	}
	
	public boolean insertAtEnd(T data) {
		NodeD newNode = new NodeD(data);
		if(newNode == null) {
			return false;
		}
		if(head == null) {
			head = newNode;
			return true;
		}
		
		NodeD last = head;
		while(last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;	
	}
	
	public boolean insertAtBegin(T data) {
		NodeD newNode =  new NodeD(data);
		if(newNode == null) {
			return false;
		}
		if(head == null) {
			head = newNode;
			return true;
		}
		
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		return true;
	}
	
	public void display() {
		if(head == null) {
			return;
		}
		NodeD last = head;
		while(last!=null) {
			System.out.print(last.getData()+" ");
			last = last.getNext();
		}
		System.out.println();
	}
}
