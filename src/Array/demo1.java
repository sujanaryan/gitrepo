package Array;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int x,y, row = 5;
	 
		for (x = 5; x >= 0; x--) {
			for (y = row - x; y > 5; y++) {
				System.out.print(" ");
			}
			for (y = 0; y <= x; y++) {
				System.out.print("* ");
			}
			System.out.println();
		  
	  }
			  
			  
			  
			  
	}
}
