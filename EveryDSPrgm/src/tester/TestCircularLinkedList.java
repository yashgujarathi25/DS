package tester;

import com.app.core.FCircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FCircularLinkedList<Integer> fcl = new FCircularLinkedList<Integer>();
		
		fcl.insert(10);
		fcl.insertAtBegin(20);
		fcl.insert(30);
		fcl.display();
		fcl.insertByPos(40, 2);
		fcl.display();
		fcl.insertByPos(50, 5);
		fcl.display();
		fcl.insertByPos(60, 5);
		fcl.display();
		fcl.insertByPos(70, 8);
		fcl.display();
//		fcl.removeFromBegin();
//		fcl.removeFromBegin();
//		fcl.removeFromBegin();
//		fcl.removeFromBegin();
//		fcl.removeFromBegin();
//		fcl.removeFromBegin();
//		fcl.removeFromBegin();
//		fcl.removeFromBegin();
//		
		
		fcl.removeFromEnd();
	}

}
