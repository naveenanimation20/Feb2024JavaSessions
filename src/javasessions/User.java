package javasessions;

import java.util.Arrays;
import java.util.Collections;

public class User {

	// class vars: global vars
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Arti";
		u1.age = 25;
		u1.city = "Pune";

		User u2 = new User();
		u2.name = "Kavita";
		u2.age = 35;
		u2.city = "Bangalore";

		User u3 = new User();
		u3.name = "Ravi";
		u3.age = 30;
		u3.city = "LA";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		System.out.println("----------");
		
		u1 = u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		System.out.println("----------");

		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//kavita
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//ravi
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//ravi

		System.out.println("----------");
		
		u3 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);////kavita
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//ravi
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//kavita

		System.out.println("----------");
		u1 = u2;		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);////ravi
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//ravi
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//kavita
		
		
		


	}

}



