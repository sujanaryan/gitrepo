//4:- Write a Java code to handle multiple exceptions using single catch block.


package classwork;

public class Expectionhandling {

	public static void main (String[]agrs) {
		
		try {
			int  arr[]= new int[10];
			
		arr[2]= arr[12]/0;
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound expectation has occured.");
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic exception has been detected.");
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		
	}
	
	
}
