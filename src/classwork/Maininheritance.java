
//5:- What is inheritance? Write down a code for Multilevel Inheritance.
// Inheritance means to take the characteristics of one(parents class) to another adding their
//own characteristics.


package classwork;

public class Maininheritance {

	public static void main(String[] args) {

		System.out.println("Characterstics of GrandParents of  Elephants");
		
		GrandparentsofElephant ee;
		ee= new GrandparentsofElephant();
		
		ee.body();
		ee.size();
		
		System.out.println(" ");
		
		System.out.println("Characterstics of Parents of  Elephants");
          ParentsofElephants ef;
          ef= new ParentsofElephants();
          
          ef.body();
          ef.size();
          ef.color();
          ef.tusk();
          
           System.out.println(" ");
          
          System.out.println("Characterstics of Parents of  Elephants");
          ChildElephant eg;
          eg= new ChildElephant();
		
          eg.body();
          eg.size();
          eg.color();
          eg.tusk();
          eg.trunk();
          eg.ears();
          
	}

}
