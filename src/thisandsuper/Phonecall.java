package thisandsuper;

public class Phonecall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone P = new Phone();
		System.out.println(" Phone ");
		P.Ram();
		P.Processor();
		P.Rom();
		System.out.println("  ");
		
		Smartphone sp= new Smartphone();
		System.out.println(" Smartphone ");
		sp.display();
		sp.camera();
		sp.storage();
		
	System.out.println(" ");
		
	}

}
