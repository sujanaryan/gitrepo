package stringdemo;

public class Name {

	public static void main(String[] args) {

		String X ="Flower";
		String X1 = "Flower";
		
		String X3 = new String("Flower");
		String X4 = new String("Flower");
		
		System.out.println(X.equals(X1));
		System.out.println(X3.equals(X4));
		
		
		System.out.println(X==X1);
		System.out.println(X3==X4);
		System.out.println(X==X4);
	}

}
