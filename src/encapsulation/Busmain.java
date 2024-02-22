package encapsulation;

public class Busmain {
	
	public static void main(String[]args) {
		
		 Bus bb = new Bus();
		 bb.setColor("Black");
		 bb.setSpeed(1000);
		 bb.setWheels(4);
		 bb.setPrice(100000);
		 
		 System.out.println(bb.getPrice());
		 System.out.println(bb.getSpeed());
		 System.out.println(bb.getWheels());
		 System.out.println(bb.getColor());
		 
		 System.out.println(bb);
		 
		 
		 
		 
	}

}
