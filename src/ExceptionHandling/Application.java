package ExceptionHandling;

public class Application {

	//amazon login
	public void m1()  {
		System.out.println("m1 method");
		m2();
	}

	//amazon cart
	public void m2() {
		System.out.println("m2 method");

		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			//report -- PASS/FAIL
			//screenshot
			//logs
		}
	}

	//Payment - ICICI bank 
	public void m3() throws ArithmeticException {
		System.out.println("m3 method");

		int i = 9 / 0;
	}

	// caller/user method
	public static void main(String[] args) {
		Application obj = new Application();

		obj.m1();

		System.out.println("Bye");
	}

}
