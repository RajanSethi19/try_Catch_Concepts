package Try_Catch_Concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class College_Form {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Enter the age here");
			sc.nextInt();
			System.out.println("Enter the salary here");
			sc.nextDouble();
			System.out.println("Enter the weight here");
			sc.nextDouble();
			System.out.println("Are you a student");
			sc.nextBoolean();
		}

		catch (InputMismatchException co) {

			System.out.println("Enter the valid input");
			
			
			
		}

	}

}
