package tester;

import com.app.core.FDoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		FDoublyLinkedList<Integer> dll = new FDoublyLinkedList<Integer>();
		
		dll.insertAtEnd(10);
		dll.display();
		dll.insertAtBegin(20);
		dll.display();
  	}
}
