package Staticdemo;

public class Callingsolarsystem {

	public static void main(String[] args) {

		Solarsystem ss = new Solarsystem();
		
		System.out.println(Solarsystem.name);
		
		Solarsystem.orbit();
		
		Solarsystem.Sun();
		
		
		System.out.println(ss.name1);
		
		ss.rotates();
		
		System.out.println(ss.vl);
		
		
		}

}
