package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {

		System.out.println(10/2); 
		
		System.out.println(9/2);//4.5 --> 4
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);
		System.out.println(9.0/2.0);
		
		//System.out.println(-9/0);
		//System.out.println(9/0);//ArithmeticException: / by zero
		
		System.out.println(9.0/0);//Infinity
		
		System.out.println(0/9);
		
		System.out.println(9/0.0);//Infinity
		
		System.out.println(9.0/0.0);//Infinity
		
		//System.out.println(0/0);//AE
		
		System.out.println(0.0/0.0);//NaN - not a number
		
		System.out.println(0/0.0);//NaN
		
		System.out.println(0.0/0);//NaN
		
		System.out.println(1.22/0);//Infinity
		
//		System.out.println(0.1+0.4);//0.5
//		System.out.println(0.1+0.2);//0.30000000000000004

		System.out.println(10);//4 bytes
		System.out.println((byte)10);//1 byte
		
		
	}

}
