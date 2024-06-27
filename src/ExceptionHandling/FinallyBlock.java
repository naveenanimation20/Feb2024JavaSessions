package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 3;// AE
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
			//close browser
			//disconnect DB
			//close connection with excel/csv/text/file
			
		}		
		System.out.println("Bye");
		
		
		//1. connection with DB: un/pwd/ ip:port
		//2. hit the SQL query
		
		//3. try-catch --> get the result
		
		//4. storing the result
		//5. use the data in your script
		
		//6. finally -- close the DB connection
		
		
		
		
		
	}

}


