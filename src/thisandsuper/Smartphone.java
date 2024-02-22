package thisandsuper;

public class Smartphone extends Phone {

	public void camera() {
		System.out.println("The camera is 200pxl.");
	}
	
	public void storage() {
		System.out.println("The storage is 25GB.");
	}
	
	public void Ram() {
		System.out.println("The Ram of Smartphone is 8GB.");
	}
	
	public void display() {
		this.Ram();
		super.Ram();
		
	}
}
