package tester;

import com.app.core.FirstQueue;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstQueue<Integer> fq = new FirstQueue<Integer>(5);
		System.out.println(fq.enQueue(1));
		System.out.println(fq.enQueue(2));
		System.out.println(fq.enQueue(3));
		System.out.println(fq.enQueue(4));
		System.out.println(fq.enQueue(5));
		System.out.println(fq.enQueue(6));
		System.out.println(fq.deQueue());
		System.out.println(fq.deQueue());
		System.out.println(fq.deQueue());
		System.out.println(fq.deQueue());
		System.out.println(fq.deQueue());
		System.out.println(fq.deQueue());
	}

}
