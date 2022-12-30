package com.app.core;

import nodepkg.Node;

public class FCircularLinkedList<T> {

	private Node head;
	
	public FCircularLinkedList() {
		this.head = null;
	}
	
	public boolean insert(T data) {
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		if(head == null) {
			head = newNode;
			newNode.setNext(head);
			return true;
		}
		Node last = head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head); 
		return true;	
	}
	
	public boolean insertAtBegin(T data) {
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		if(head == null) {
			head = newNode;
			newNode.setNext(head);
			return true;
		}
		Node last = head;
		while(last.getNext()!=head)
		{
			last = last.getNext();
		}
		newNode.setNext(head);
		head = newNode;
		last.setNext(head);
		return true;
	}
	
	public boolean insertByPos(T data, int pos) {
		if(pos<=0 || (head==null && pos>1)) {
			return false;
		}
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		if(pos == 1) {
			Node last = head;
			while(last.getNext()!= null)
			{
				last = last.getNext();
			}
			newNode.setNext(head);
			head = newNode;
			last.setNext(head);
			return true;
		}
		
		Node prev = head;
		for(int i=1; i<pos-1; i++) {
			prev = prev.getNext();
			if(prev == head) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
	
	public void display() {
		if(head == null) {
			return;
		}
		Node temp = head;
		while(temp.getNext()!=head) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.print(temp.getData());
		System.out.println();
	}
	
	public void removeFromBegin() {
		if(head == null) {
			return;
		}
		if(head.getNext() == head) {
			System.out.println(head.getData());
			head = null;
			return;
		}
		
		Node last = head;
		while(last.getNext()!=head) {
			last = last.getNext();
		}
		System.out.println(head.getData());
		head = head.getNext();
		last.setNext(head);	
	}
	
	public void removeFromEnd() {
		if(head == null) {
			return;
		}
		if(head.getNext() == head) {
			System.out.println(head.getData());
			head = null;
			return;
		}
		
		Node last = head;
		Node prev = head;
		while(last.getNext()!=head) {
			prev=last;
			last = last.getNext();
		}
		System.out.println(last.getData());
		prev.setNext(last.getNext());
		return;
	}
	
	
}
