package comparetorandcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort {

	public static void main(String[] args) {

		ArrayList<Employee> ee= new ArrayList<Employee>();
		
		ee.add(new Employee(10000,"Samana",29 ));
		ee.add(new Employee(20000,"Sujan",26 ));
		ee.add(new Employee(30000,"Sambhav",23 ));
		ee.add(new Employee(40000,"Sagun",24 ));
		ee.add(new Employee(50000,"Soujanya",2 ));
		
		
	Collections.sort(ee);
	for (Employee s:ee) {
		System.out.println(s.salary+ " "+ s.name+ " "+ s.age);
	}
	
	}

}
