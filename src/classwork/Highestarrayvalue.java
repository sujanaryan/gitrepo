//3:-  How To Find The Largest Value From The Given Array.


package classwork;

public class Highestarrayvalue {

	public static void main(String[] args) {

		
		int arr[]= {10,20,30,40,50};
		
		int max = arr[0];
		
		for (int a = 0 ; a < arr.length; a++) {
			
			if(max < arr[a]) {
				
				max= arr[a];
				
			}
			
		}
		System.out.println("The maximum value of array is " + max);
			
		
 

		}
	}

