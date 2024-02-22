package classandobject;

public class Bus {
	
	int Tyre= 4;
	String seats = "Black";
	String color = "Brown";
	
	public void Steering() {
		System.out.println("The bus has steering wheel.");	
	}
		
	public void Emergency() {
		System.out.println("The bus has Emergency exist door.");	
		
	}
	
	public void Compartments() {
		System.out.println("The bus has been divided into two compartments");	
		
	}
	public void Run() {
		System.out.println("The bus run on road.");	
	}
	
	public Bus () {
		System.out.println("The bus has two doors.");
		
		
	}
	public Bus (String type) {
		System.out.println("The brand of the bus is" + type);
	}
	
	public Bus (String type1 , String type2) {
		System.out.println("The bus is " +"type1" + "and"+ "type2" +"one.");
		
	}
	public Bus (int windows) {
		System.out.println("The windows in bus are" + windows);
		}
	
	
	
}

