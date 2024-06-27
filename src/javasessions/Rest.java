package javasessions;

import java.util.Arrays;

public class Rest {

	public void m1() {
		System.out.println("m1 method");
		m2();
		Rest.t1();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		m1();
	}

	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
		// t1();
		Rest r1 = new Rest();
		r1.m1();
		String a[] = { "a", "b" };
		main(a);
	}

	// NS --> NS : no object
	// S --> S: no object, use class name
	// NS --> S : use class name
	// S --> NS : need to create object -- need to use call by ref

	public static void main(String[] args) {
//		Rest obj = new Rest();
////		
//		obj.m1();
//
//		Rest.t3();

		
	}
}
