package classandobject;

public class Cowmain {

	
	public static void main(String[] args) {

		Cow cc = new Cow();

		cc.milk();
		cc.eat();
		cc.walk();
		cc.reproduce();
		System.out.println(cc.color);
		System.out.println(cc.tail);
        System.out.println(cc.horns);
		System.out.println("*********with type*******");

		Cow cd = new Cow("Jersey");

		cd.milk();
		cd.eat();
		cd.walk();
		cd.reproduce();
		System.out.println(cd.color);
		System.out.println(cd.tail);
		System.out.println(cd.horns);

		System.out.println("*************** With COLOR And AGE************");

		Cow ce = new Cow("Black", 4);

		ce.milk();
		ce.eat();
		ce.walk();
		ce.reproduce();
		System.out.println(ce.color);
		System.out.println(ce.tail);
        System.out.println(ce.horns);
		
		
}}
