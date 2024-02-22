package setdemo;

import java.util.TreeSet;

public class TreeSetDemo {
// It sort the elements.
	// It doesn't allow null value.
	//It doesn't allow the duplicate values.
	public static void main(String[] args) {

		TreeSet<String> Animals = new TreeSet<String>();
		Animals.add("Cats");
		Animals.add("Dogs");
		Animals.add("Rabbit");
		Animals.add("Mouse");
		Animals.add("Squarel");
		Animals.add("");
		//Animals.add(null);
		
		for (String An : Animals) {
			System.out.println(An);
		}
		
		System.out.println(Animals.size());
	}

}
