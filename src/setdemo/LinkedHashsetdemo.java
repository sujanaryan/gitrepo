package setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetdemo {
//It shouldn't accept the duplicate values.
	//It should maintain the insertion order.
	
	public static void main(String[] args) {

		Set<String> Animals = new LinkedHashSet<String>();
		
		Animals.add("Cats");
		Animals.add("Dogs");
		Animals.add("Rabbit");
		Animals.add("Mouse");
		Animals.add("Squarel");
		Animals.add("");
		Animals.add(null);
		
		for (String An : Animals) {
			System.out.println(An);
		}
		
		System.out.println(Animals.size());
		
		System.out.println("After adding duplicate value.");
		
		Animals.add("Cats");
		Animals.add("Dogs");
		Animals.add("Rabbit");
		Animals.add("Mouse");
		Animals.add("Squarel");
		Animals.add("");
		Animals.add(null);
		
		for (String An : Animals) {
			System.out.println(An);
		}
		
		System.out.println(Animals.size());
	}

}
