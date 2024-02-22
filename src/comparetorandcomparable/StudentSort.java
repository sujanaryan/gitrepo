package comparetorandcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

	public static void main(String[] args) {

		ArrayList<Students> al = new ArrayList<Students>();
        al.add(new Students(8,"Vijay",23));  
        al.add(new Students(2,"Ajay",27));  
        al.add(new Students(5,"Jai",21)); 
        al.add(new Students(4,"Sanjay",19)); 
        al.add(new Students(3,"Dhananjay",16)); 
      
        
        
        Collections.sort(al);
	for (Students st:al) {
		System.out.println(st.rollno+ " " + st.name + " "+ st.age);
	}
	
	}

}
