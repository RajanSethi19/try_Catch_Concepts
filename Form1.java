package Try_Catch_Concepts;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Form1 {

	 static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Enter the age");
			int age = sc.nextInt();
			
		}
		catch (InputMismatchException c) {
			System.out.println("ENTER THE VALID AGE AS INTEGER VLUE ONLY");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age again");
			int age = sc.nextInt();
			System.out.println(age);
			
			
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = sc.next();
		
	}

}
