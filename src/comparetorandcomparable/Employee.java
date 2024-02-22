package comparetorandcomparable;

public class Employee implements Comparable<Employee>{
	
	int salary;
	String name;
	int age;
	
	
	 Employee(int salary, String name, int age) {
		this.salary = salary;
		this.name = name;
		this.age = age;
		
	}


	@Override
	public int compareTo(Employee ee) {
		if (salary == ee.salary)
	
		return 0;

		else if (salary > ee.salary)
			return 1;
		
			else 
				return -1;
	}
	
}
	
	


