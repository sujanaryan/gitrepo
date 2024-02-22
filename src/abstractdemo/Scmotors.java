package abstractdemo;

public abstract class Scmotors {

	public void start( ) {
		System.out.println("Car starts!!!!");
	}
	
	public void stop () {
		System.out.println("Car stops!!");
	}
	
	//Abstract methods only have one declarations.
	public abstract void accelerator();
	
	public abstract void breaks();
	public abstract void clutch();
	
}
