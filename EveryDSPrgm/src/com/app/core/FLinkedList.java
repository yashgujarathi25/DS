package com.app.core;

import nodepkg.Node;

public class FLinkedList<T> {

	private Node head;

	public FLinkedList() {
		this.head = null;
	}

	public boolean insert(T data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}

	public boolean insertAtBeginning(T data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		newNode.setNext(head);
		head = newNode;
		return true;
	}

	public boolean insertByPosition(T data, int pos) {
		if (pos <= 0 || (head == null && pos > 1)) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	public void display() {
		if (head == null)
			return;
		Node last = head;
		while (last != null) {
			System.out.print(last.getData()+" ");
			last = last.getNext();
		}
		System.out.println();
	}

	public boolean delete() {
		if (head == null) {
			return false;
		}
		if (head.getNext() == null) {
			Node temp = head;
			head = null;
			return true;
		}
		Node last = head;
		Node<T> prev = head;
		while (last.getNext() != null) {
			prev = last;
			last = last.getNext();
		}
		prev.setNext(null);
		return true;
	}

	public boolean deleteByPosition(int pos) {
		if (pos <= 0 || head == null) {
			return false;
		}
		if (pos == 1) {
			head = head.getNext();
			return true;
		}
		Node prev = head;
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev.getNext() == null) {
				return false;
			}
		}
		prev.setNext(prev.getNext().getNext());
		return true;
	}
	
	public boolean deleteValue(T data) {
		if(head == null) {
			return false;
		}
		if(head.getData() == data) {
			head = head.getNext();
			return true;
		}
		Node del=head;
		Node prev=head;
		while(del.getData()!=data) {
			prev=del;
			del= del.getNext();
			if(del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	
	public void displayRev(Node head) {
		if( head == null) {
			return;
		}
		displayRev(head.getNext());
		System.out.print(head.getData()+" ");
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void reverse() {
		if(head == null || head.getNext() == null) {
			return;
		}
		Node n1 = head; Node n2= head.getNext();
		Node n3;
		while(n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			n1=n2;
			n2=n3;
		}
		head.setNext(null);
		head = n1;
	}
}
