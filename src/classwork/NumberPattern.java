//Write a program to print the pattern given below
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
package classwork;

public class NumberPattern {

	public static void main(String[] args) {
    
        int i,j, rows = 5;

	    for (i = 1; i <= rows; ++i) {
	      for (j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }


}

}
