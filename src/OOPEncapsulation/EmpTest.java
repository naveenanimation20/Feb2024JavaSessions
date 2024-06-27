package OOPEncapsulation;

import java.util.Arrays;

public class EmpTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		
		e1.setName("Arti");
		System.out.println(e1.getName());
		
		e1.setAge(30);
		System.out.println(e1.getAge());
		
		e1.setName("Arti Sharma");
		System.out.println(e1.getName());
		
		
		Employee e2 = new Employee();
		e2.setName("Tom");
		System.out.println();
		
	}

}


