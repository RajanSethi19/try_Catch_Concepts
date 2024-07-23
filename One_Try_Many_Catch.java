package Try_Catch_Concepts;

public class One_Try_Many_Catch {

	public static void main(String[] args) {
		int a[] = new int[3]; 
		//if we put here new int[4] so it means no error so no exception will run because catc
		//h block doesn't have any exception so it will not enter into any catch block
		a[0] = 23;
		a[1] = 23;
		a[2] = 23;

		try {
			a[3] = 23;
		} catch (ArrayIndexOutOfBoundsException v1) {

			System.out.println("I am in ArrayIndexOutOfBoundsException;");
		} catch (ArithmeticException v2) {

			System.out.println("I am in ArithmeticException");
		} catch (ArrayStoreException v3) {

			System.out.println("I am in ArrayIndexOutOfBoundsException;");
		}

	}

}
