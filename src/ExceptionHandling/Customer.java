package ExceptionHandling;

import java.io.FileInputStream;

public class Customer {
	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		Customer obj = new Customer();
		obj = null;

		try {
			int i = 9 / 3;// AE
			obj.name = "Tom";// NPE
			System.out.println("Hello");
		}

		catch (NullPointerException  | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(" exception is coming");
			e.printStackTrace();
		}

//		catch (ArithmeticException e) {
//			System.out.println("AE exception is coming");
//			e.printStackTrace();
//		}
//
//		catch (Exception e) {
//			System.out.println("Some exception is coming");
//			e.printStackTrace();
//		}

		System.out.println("Bye");
		
		//checked/compile time 
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		//checked/compile time 
//		//FileInputStream ip = new FileInputStream("c:\\test.pdf");

	}

}
