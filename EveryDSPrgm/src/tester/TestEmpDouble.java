package tester;

import com.app.core.Employee;
import com.app.core.FDoublyLinkedList;

public class TestEmpDouble {

	public static void main(String[] args) {
		
		FDoublyLinkedList<Employee> fdl = new FDoublyLinkedList<Employee>();
		
		Employee e1 = new Employee(1, "yash", 2000);
		fdl.insertAtBegin(e1);
		fdl.display();
		
		fdl.insertAtEnd(new Employee(2, "Tanmay", 2500));
		fdl.display();
		
	}
}
