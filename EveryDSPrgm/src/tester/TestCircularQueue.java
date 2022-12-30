package tester;

import com.app.core.FCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FCircularQueue<Integer> cq = new FCircularQueue<Integer>(5);
		
		System.out.println(cq.enqueue(1));
		System.out.println(cq.enqueue(2));
		System.out.println(cq.enqueue(3));
		System.out.println(cq.enqueue(4));
		System.out.println(cq.enqueue(5));
		System.out.println(cq.enqueue(6));
		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
		System.out.println(cq.peek());
		
	}

}
