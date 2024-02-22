package collectionframeworkdemo;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistdemo {

	public static void main(String[] args) {
		 List<Integer> list = new LinkedList<Integer>();
		 
		 list.add(11);
		 list.add(12);
		 list.add(13);
		 list.add(14);
		 list.add(15);
		 list.add(16);
		 list.add(17);
		 list.add(18);
		 list.add(19);
		 list.add(20);
		 list.add(21);
		 list.add(22);
		 
		 System.out.println(list.size());
		 
		 list.remove(11);
		 list.remove(5);
		 list.remove(7);
		 
		 System.out.println(list);
		 System.out.println("size:-" + list.size());
	 
		 for (Integer S :list) {
			 System.out.println(S);
		 
			 
//System.out.println(list);
	 }
		 
		 System.out.println(list.contains(5));
	}

}
