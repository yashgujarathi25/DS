package tester;

import com.app.core.FirstStack;

public class TestStack {
	public static void main(String[] args) {
		FirstStack<Integer> obj =  new FirstStack<Integer>(5);
		
	
		System.out.println(obj.push(1));
		System.out.println(obj.push(2));
		System.out.println(obj.push(3));
		System.out.println(obj.push(4));
		System.out.println(obj.push(5));
		System.out.println(obj.push(6));
		
		System.out.println(obj.pop());
		System.out.println(obj.peek());
		
				
	}
}
