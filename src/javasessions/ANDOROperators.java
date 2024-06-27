package javasessions;

public class ANDOROperators {

	public static void main(String[] args) {

		//AND -- & , &&

		boolean c1 = false;
		boolean c2 = false;
		boolean c3 = false;
		boolean c4 = false;

		if(c1 & c2 & c3 & c4) {//false & false & false & false =>false
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		//&& - short circuit operator
		if(c1 && c2 && c3 && c4) {//false 
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		
		//OR -- | , ||
		
		boolean b1 = false;
		boolean b2 = true;
		boolean b3 = true;
		boolean b4 = false;

		
		if(b1 | b2 | b3 | b4) {//true | true | true | false => true
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
		
		// || -- short circuit
		if(b1 || b2 || b3 || b4) {//false || true
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
		
		
		//WAP - three different numbers are there
		//find out the max number
		int x = 100;
		int y = 50;
		int z = 75;
		
		if(x>y && x>z) { //true && true => true
			System.out.println("x is greatest");
		}
		else if(y>z) {//false
			System.out.println("y is greatest");
		}
		else {
			System.out.println("z is greatest");
		}
		
		
	}

}
