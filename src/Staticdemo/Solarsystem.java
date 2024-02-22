package Staticdemo;

public class Solarsystem {

	static String name = "Jupiter" ;
	String name1 = "Earth";
	
	// changing string datatype to ineteger.
	String numberofplanet= "8";
	int vl = Integer.parseInt(numberofplanet);
	
	static {
		System.out.println("I come before every execution.");
	}
	
	public void rotates() {
		System.out.println("The every planet rotates around the Sun.");
	}
	
	public static void orbit() {
		System.out.println("Every planet have its own orbit.");
	}
	
	public static void Sun() {
		System.out.println("The Sun is primary component of solar system.");
	}
	
}
