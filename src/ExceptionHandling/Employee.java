package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;//AE
			//error
		} 
		catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Bye");

	}

}

