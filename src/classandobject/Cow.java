package classandobject;

public class Cow {

	String color = "black";

	int tail = 1;
	
	 int horns = 2;
	

	public void eat() {
		System.out.println("The cow can eat");
	}

	public void walk() {
		System.out.println("This cow can walk");
	}

	public void milk() {
		System.out.println("This cow can milk.");
	}

	
	public void reproduce() {
		System.out.println("This cow can reproduce.");
	}

	// Non Paramterized Constructor
	public Cow() {
		System.out.println("Cow Default");
	}

	// Paramterized Constructor
	public Cow(String type) {

		System.out.println("The type of the Cow is =:" + type);
	}

	public Cow(String color, int age) {
		System.out.println("The color of the Cow  is=:" + color);
		System.out.println("The age of the Cow is =:" + age);
	} 
	
}
