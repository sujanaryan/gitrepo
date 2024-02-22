package abstractdemo;

public class CarShowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
     Scmotors sc= new Audi100();
     
     sc.accelerator();
     sc.breaks();
     sc.clutch();
     sc.start();
     sc.stop();
     
      System.out.println(" new car");
      
     Scmotors sm= new Audi100();
     sm.breaks();
     sm.clutch();
     
     
     
}
	
}
