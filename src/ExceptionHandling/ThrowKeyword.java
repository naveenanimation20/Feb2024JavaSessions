package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		//throw
		
		String data = null;
		
		if(data == null) {
			//want to throw my own exception
			throw new RuntimeException("DATA NOT FOUND EXCEPTION");
		}
		
		System.out.println("fill the form");
		
	}
	
	
	//try-catch
	//throw vs throws??
	//finally block

}
