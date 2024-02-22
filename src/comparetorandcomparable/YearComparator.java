package comparetorandcomparable;

import java.util.Comparator;

public class YearComparator implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		 College s1 = (College) o1;
	        College s2 = (College) o2;

	        if (s1.year == s2.year)
		
		
		return 0;
	        
	        else if (s1.year > s2.year)
	            return 1;
	        else
	            return -1;  
	}
	
	
	

}
