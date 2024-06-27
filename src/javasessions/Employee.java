package javasessions;

public class Employee {

	// data members:
	// class vars: instance var
	String name;
	int age;
	double salary;
	boolean isPerm;

	public static void main(String[] args) {

		// create the object of Employee class: using new keyword

		Employee obj = new Employee();

		obj.name = "Tom";
		obj.age = 20;
		obj.salary = 12.33;
		obj.isPerm = true;
		
		System.out.println(obj);
		

		System.out.println(obj.name + " " + obj.age + " " + obj.salary + " " + obj.isPerm);

		Employee e1 = new Employee();
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isPerm);
		e1.name = "Peter";
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isPerm);

		// no reference objects: not recommended
		new Employee().name = "Ekta";
		new Employee().age = 30;
		
		new Employee();
		Employee t1 = new Employee();
		

		// null reference objects
//		Employee e2 = new Employee();
//		e2.name = "Kavi";
//		System.out.println(e2.name);//Kavi
//		e2 = null;
//		System.out.println(e2.name);//NPE
//		e2.age = 30;//null.age = 30: NPE
//		System.out.println(e2.age);

		//
		Employee e3 = new Employee();
		e3.name = "Naveen";
		System.out.println(e3.name);// Naveen

		e3 = null;
		e3 = new Employee();
		e3.name = "Testing";
		e3.age = 30;
		System.out.println(e3.name);
		System.out.println(e3.age);

		//
		Employee e4;
		e4 = new Employee();

	}

}
