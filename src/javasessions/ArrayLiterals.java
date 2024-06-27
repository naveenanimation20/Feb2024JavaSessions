package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		//int array:
		//1. using new:		
		int i[] = new int[10]; //0-3
		
		//2. array literals:
		int p[] = {1,4,3,22,12,90,7,2,4};//9
		
		System.out.println(p.length);//9 --> 0 to 8
		System.out.println("li = " + 0);
		System.out.println("hi = " + (p.length-1));
		
		System.out.println(p[0]);
		//System.out.println(p[9]);
		
		for(int e : p) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(p));
		
		String students[] = {"jay", "Akash", "Ravi", "Pooja"};//0-3
		
		for(String e : students) {
			System.out.println(e);
		}
		
		
		
		System.out.println(students.length);
		
		System.out.println(Arrays.toString(students));
		
		students[0] = "Naveen";
		System.out.println(Arrays.toString(students));

		
		Object empData[] = {"Ekta", 25, 43.33, 'f', true};
		for(Object e : empData) {
			System.out.println(e);
		}

	}

}
