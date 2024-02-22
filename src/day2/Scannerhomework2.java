package day2;

import java.util.Scanner;

public class Scannerhomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Area of Cubiod
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Length :-");
		int Length = sc.nextInt();
		
		System.out.println("Breadth:-");
		int Breadth = sc.nextInt();
		
		System.out.println("Height:-");
		int Height = sc.nextInt();
		
		System.out.println("Diameter:-");
		int Diameter = sc.nextInt();
		
		float pie = 3.14f;
		
		double Areacyc = (((pie*Diameter/2*Height)*2)+((pie*Diameter/2*Diameter/2)*2));
		
		System.out.println("Surface Area of the Cylinder is " + Areacyc);
		
		int Area=((Length*Breadth)+(Breadth*Height)+(Height*Length) )*2;
		
		System.out.println("Surface Area of the Cubiod is " + Area);
	}

}
