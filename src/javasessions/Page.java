package javasessions;

public class Page {
	
	public static int age =10;

	//psvm[String a[]] - JVM -- > Page.main()
	//caller method -- user method
	//not write buss logic in method
	public static void main(String a[]) {		
		System.out.println("hello");
		Page.main(10);
		Page.main(10, 20);
	}
	
	public static void main(String a[], String p[]) {		
		System.out.println("naveen");
		Page.main(10);
		Page.main(10, 20);
	}

	
	public static void main(int a) {		
		System.out.println("hi " + a);
	}
	
	public static void main(int a, int b) {		
		System.out.println("bye " + (a+b));
	}

}

//
//Hi Naveen .. 
//was trying to understand infinite loop vs stack overflow .. 
//Could you please let us know where the infinite loop execution will happen?