package javasessions;


public class DataTypes {
	

	public static void main(String[] args) {
		
		//data types:
		//strict data type
		
		//2 data types:
		//1. primitive data type: 
		//no need to create the object, it will take some fixed space in the memory
		
		//1. Numeric Type: 
				//a.  Integral value
							//a.1: integer: byte, short, int, long
							//a.2: floating-type: float, double
				//b. Character: 
		//2. Boolean type: boolean: true/false
		
		
		
		//2. non primitive data type: need to create the Object (oop) -- String, class, arrays, interace
		
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		 b = 20;
		 b = 30;
		System.out.println(b);
		byte h = 30;
		
		byte j = -10;
		byte j1 = -128;
		System.out.println(j1);
		System.out.println(j);
		
		//2. short:
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short s = 1000;
		short s1 = 1;
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 50000;
		int l = 10;
		
		//4. long:
		//size: 8 bytes = 64 bits
		//range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long t = 10000000999l;
		long t1 = 232320098888l;
		long t2 = 100;
		System.out.println(t1);
		
		//long tel = 989898789;//tel, SSN, aadhar card, acc number, CC
		long ll = 1; //8 bytes
		
		
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: upto 7 digits can be taken
		float r = 12.33f;
		System.out.println(r);
		float r1 = (float)34.44;
		System.out.println(r1);

		//6. double:
		//size: 8 bytes = 64 bits
		//range: upto 15 digits can be taken
		double d = 12.3333333d;
		System.out.println(d);
		
		double d1 = 100;
		System.out.println(d1);
		
		double d2 = 100.44f;
		
		//7. Character: single digit: unicode: ASCII values
		//size: 2 bytes = 16 bits
		//a to z: 97 to 122
		//A to Z: 65 to 90
		//0 to 9: 48 to 57
		char c1 = 'a'; //a to z
		char c2 = 'H'; //A to Z
		char c3 = '1'; //0 to 9
		char c4 = '$'; //special chars
		System.out.println(c1);
		System.out.println(c3);
		
		char gender = 'm';
		char exe = 'Y';
		char c5 = 97;//-> a
		System.out.println((byte)c5);//97-->a --> 97
		
		//8. boolean: 
		//range: true/false -- boolean literals
		//size: ~ 1 bit
		boolean bg = true;
		boolean flag = false;
		
		
		

	}

}
