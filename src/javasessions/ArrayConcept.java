package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		//array : non primitive data type
		
		//limitations of array:
		//1. size is fixed: static array : to overcome this problem, we have to dynamic array(ArrayList)
		//2. can store only similar type of data: to overcome this problem, we can use Object array but this is till static array, then we can use ArrayList with generics
		
		
		//int array:
		int i[] = new int[4]; //0-3
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;//AIOB
		
		System.out.println(i[0]);//O(1)
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		//use cases:
		//month array: 12 -- 0 to 11
		//120 seats : 
		
		int len = i.length;//4
		int hi = len-1;//3
		int li = 0;//0
		System.out.println(len);
		System.out.println(hi);
		System.out.println(li);
		
		//to print all the values of array: for loop:
		//index based loop
		for(int k=0; k<=i.length-1; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		
		System.out.println("---------");
		
		//for each: 
		for(int e : i) {
			System.out.println(e);
		}
		
		
		//double array:
		
		double d[] = new double[3]; // 0-2
		d[0] = 12.33;
		d[1] = 10.99;
		d[2] = 23.44;
		
		System.out.println(Arrays.toString(d));

		
		for(double e : d) {
			System.out.println(e);
		}
		
		//char array:
		char ch[] = new char[4];//0-3
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'D';
		
		System.out.println(Arrays.toString(ch));
		
		for(char e : ch) {
			System.out.println(e);
		}
		
		//String array:
		String empNames[] = new String[3];
		empNames[0] = "Naveen";
		empNames[1] = "Ravi";
		empNames[2] = "Ayesha";
		
		System.out.println(Arrays.toString(empNames));
		
		System.out.println(empNames[0]);
		
		for(String e : empNames) {
			System.out.println(e);
		}
		
		System.out.println("-------");
		
		//
		int num[] = new int[4]; //0-3
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		
		//System.out.println(num);//will print memory address of the array
		System.out.println(Arrays.toString(num));


		//
		
		String names[] = new String[5];
		System.out.println(Arrays.toString(names));
		
		
		names[0] = "Naveen";
		names[1] = "Ravi";
		names[2] = "Ayesha";
		names[3] = "Ekta";
		names[4] = "Rahul";
		
		for(String e : names) {
			System.out.println(e);
				if(e.equals("Ayesha")) {
					System.out.println("HR");
					//break;
				}
				else if(e.equals("Ekta")) {
					System.out.println("Admin");
				}
				
		}
		
		//
		System.out.println("---print----");
		int n[] = new int[4]; //0-3

		n[0] = 100;
		n[1] = 200;
		n[2] = 300;
		n[3] = 400;
		
		System.out.println(Arrays.toString(n));
		System.out.println(n.length);
		
		
		for(int e : n) {
			System.out.println(e);
				if(e == 200) {
					System.out.println("Bye");
					break;
				}
		}
		
		System.out.println("---print----");

		//emp data: name(String), age(int), salary(double), gender(char), isPerm(boolean)
		//Object Array:
		
		Object ob[] = new Object[5];
		ob[0] = "Madhu";
		ob[1] = 25;
		ob[2] = 23.44;
		ob[3] = 'f';
		ob[4] = true;
		
		System.out.println(Arrays.toString(ob));
		
		for(Object e : ob) {
			System.out.println(e);
		}
		
		
	}

}
