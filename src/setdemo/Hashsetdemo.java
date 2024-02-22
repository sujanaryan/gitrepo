package setdemo;

import java.util.HashSet;
import java.util.Set;

public class Hashsetdemo {
//It doesn't allow duplicate values.
	//It allows null value.
	//It doesn't maintain insertion order.
	public static void main(String[] args) {

		Set <String> set = new HashSet<String>();
		
		set.add("Cats");
		set.add("Dogs");
		set.add("Rabbit");
		set.add("Mouse");
		set.add("Squarel");
		set.add("");
		set.add(null);
		
		System.out.println(set.size());
		
		for (String vl :set) {
			System.out.println(vl);}
		
		
		set.add("Cats");
		set.add("Dogs");
		set.add("Rabbit");
		set.add("Mouse");
		set.add("Squarel");
		set.add("");
		set.add(null);
		System.out.println("after adding duplicate values:");
		
		System.out.println(set.size());
		
		
		for (String vl :set) {
			System.out.println(vl);
			
		}
		
		
		
		
		}

}
