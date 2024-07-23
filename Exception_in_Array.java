package Try_Catch_Concepts;

public class Exception_in_Array {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 12;
		a[1] = 23;
		a[2] = 24;

		try {
			a[3] = 56;
		} catch (ArrayIndexOutOfBoundsException t1) {
			System.out.println(t1);
			System.out.println("I am in catch block");
			
			

		}

	}

}
