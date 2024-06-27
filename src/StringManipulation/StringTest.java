package StringManipulation;

public class StringTest {

	public static void main(String[] args) {

		//1. using string literals:
		//2. using new keyword
		
		String s1 = "Hello";//1 -- SCP
		String s2 = new String("Hello");//1 - heap
		
		
		String s3 = new String("Naveen");//2-heap + scp

		String s4 = "Naveen";//0
		
		String s5 = new String("Naveen");//1 - heap
		
		String s6 = "naveen";//SCP
		String s7 = "naveen";
		
		String t1 = "Hello";
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1==t1);//true
		System.out.println(s1.equals(t1));//true
		
		
		String r1 = new String("selenium");
		r1 = r1.intern();

		
	}

}
