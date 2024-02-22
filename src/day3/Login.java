package day3;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Username:-");
		String Username = sc.next();

		System.out.println("Pin:- ");
		int Pin = sc.nextInt();

		if (Username.equals("Samana") && Pin == (12345)) {
			System.out.println("Welcome to Homepage");

		} else if (Username.equals("Kamal") && Pin == (4567)) {
			System.out.println("Welcome to Homepage");
			
		} else if (Username.equals("Sujan") && Pin == (12355)) {
			System.out.println("Welcome to Homepage");
			
		}else if (Username.equals("Sagun") && Pin == (12355)) {
			System.out.println("Welcome to Homepage.");
			
		}else if (Username.equals("Manju")  && Pin == (12445)) {
			System.out.println("Welcome to Homepage.");
			
		} else if (Username.equals("Sambhav") && Pin == (11345)) {
			System.out.println("Welcome to Homepage.");
		
			
		} else {
			System.err.println("Invalid Credentials!!");
		}

	}

}
