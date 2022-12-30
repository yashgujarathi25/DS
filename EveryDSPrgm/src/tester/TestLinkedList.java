package tester;

import com.app.core.FLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FLinkedList<Integer> sll = new FLinkedList<Integer>();
		
		sll.insert(10);
		sll.display();
		sll.insertByPosition(20, 2);
		sll.display();
		sll.displayRev(sll.getHead());
		sll.insert(30);
		sll.insert(40);
		sll.display();
		sll.reverse();
		sll.display();
	
	}

}
